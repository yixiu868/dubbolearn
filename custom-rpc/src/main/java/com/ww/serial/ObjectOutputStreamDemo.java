package com.ww.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description: 序列化
 * @author xiaohua
 * @date 2021年8月19日 上午9:44:39
 */
public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:/test/person.txt"))) {
            output.writeObject(new Person("特仑苏", 18));
        }
    }
}
