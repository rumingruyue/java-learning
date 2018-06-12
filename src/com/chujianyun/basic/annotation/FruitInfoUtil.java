package com.chujianyun.basic.annotation;

import java.lang.reflect.Field;

/**
 * @author 刘汪洋 liuwangyang@corp.netease.com
 * @date 2018/06/01
 */
public class FruitInfoUtil {

    public static void main(String[] args) {
        getFruitInfo(Apple.class);
    }

    public static void  getFruitInfo(Class<?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for (Field field: fields){
            if( field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(fruitName.value());
            }

            if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println(fruitColor.fruitColor());
            }

            if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                System.out.println(fruitProvider.id()+":"+fruitProvider.name()+":"+fruitProvider.address());
            }

        }

    }
}
