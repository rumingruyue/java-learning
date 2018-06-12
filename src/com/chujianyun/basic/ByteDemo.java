package com.chujianyun.basic;

/**
 * @author 刘汪洋 liuwangyang@corp.netease.com
 * @date 2018/05/25
 */
public class ByteDemo {
    public static void main(String[] args) {
        byte ch = 0xc;
        String str ="aqw";
        byte[] bytes = str.getBytes();
        System.out.println(bytes);
    }

}
