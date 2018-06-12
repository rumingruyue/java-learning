package com.chujianyun.basic.nio;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 刘汪洋 w1251314@sohu.com
 * @date 2018/06/09
 */
public class FileChannelDemo {

    @Test
    public void readFile(){
        try {
            RandomAccessFile aFile = new RandomAccessFile("/Users/liuwangyang/Documents/工作/业务/网盘文档/验厂/我的文件/验厂地址.csv","rw");
            FileChannel fileChannel =  aFile.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
            int bytesRead = fileChannel.read(byteBuffer);
            while (bytesRead != -1){
                System.out.println("read"+bytesRead);
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()){
                    System.out.println((char)byteBuffer.get());
                }
                byteBuffer.clear();
                bytesRead = fileChannel.read(byteBuffer);
            }
            aFile.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
