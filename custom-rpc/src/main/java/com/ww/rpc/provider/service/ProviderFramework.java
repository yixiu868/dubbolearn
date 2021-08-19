package com.ww.rpc.provider.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class ProviderFramework {

    /**
     * 提供者暴露接口
     * @param service
     * @param port
     * @throws IOException
     */
    @SuppressWarnings("resource")
    public static void export(Object service, int port) throws IOException {
        ServerSocket server = new ServerSocket(port);
        
        while (true) {
            System.out.println("进入服务提供者");
            Socket socket = server.accept();
            System.out.println("接收到消费者请求");
            
            new Thread(() -> {
                try {
                    ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                    
                    // 读取方法名
                    String methodName = (String) input.readObject();
                    // 参数类型数组
                    Class<?>[] argTypes = (Class<?>[]) input.readObject();
                    // 参数值数组
                    Object[] argValues = (Object[]) input.readObject();
                    
                    // 方法调用
                    Method method = service.getClass().getMethod(methodName, argTypes);
                    Object result = method.invoke(service, argValues);
                    
                    // 返回结果
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeObject(result);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
