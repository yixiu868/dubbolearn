package com.ww.rpc.consumer;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.net.Socket;

public class ConsumerFramework {

    @SuppressWarnings({ "unchecked", "resource" })
    public static <T> T refer(Class<T> interfaceClass, String host, int port) {
        System.out.println("消费者发起请求...");
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class<?>[] { interfaceClass }, 
                (proxy, method, args) -> {
            System.out.println("发起消费者请求");
            Socket socket = new Socket(host, port);
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            // 方法名
            output.writeObject(method.getName());
            // 方法参数类型
            output.writeObject(method.getParameterTypes());
            // 方法参数
            output.writeObject(args);
            
            System.out.println("接收到返回结果");
            // 获取返回结果
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            Object result = input.readObject();
            System.out.println("返回结果:" + result);
            return result;
        });
    }
}
