package com.sikku.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("D:\\Code\\INTELLIJ\\collection\\src\\com\\sikku\\map\\abc.properties");
        p.load(fis);

        p.setProperty("111","AAA");

        FileOutputStream fos = new FileOutputStream("D:\\Code\\INTELLIJ\\collection\\src\\com\\sikku\\map\\abc.properties");
        p.store(fos,"updated by upendra");

        System.out.println(p);
    }
}
