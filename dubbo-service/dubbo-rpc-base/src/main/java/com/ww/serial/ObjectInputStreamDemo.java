package com.ww.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description: 反序列化
 * @author xiaohua
 * @date 2021年8月19日 上午10:08:57
 */
public class ObjectInputStreamDemo {

    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:/test/person.txt"))) {
            Person person = (Person) input.readObject();
            // 反序列化读取到:Person [name=特仑苏, age=18]
            System.out.println("反序列化读取到:" + person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
