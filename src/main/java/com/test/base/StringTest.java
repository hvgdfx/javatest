package com.test.base;

public class StringTest {

    public static void main(String[] args) {

        StringBuffer sBuffer = new StringBuffer("你好");

        sBuffer.append("www");
        sBuffer.append(".baidu");
        sBuffer.append(".com");

        System.out.println(sBuffer);

        StringBuilder sBuilder = new StringBuilder("hello");
        sBuilder.append("1");
        sBuilder.append("2");
        sBuilder.append("3");
        System.out.println(sBuilder);
    }
}
