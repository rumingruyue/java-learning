package com.chujianyun.basic.annotation;

import java.lang.annotation.*;

/**
 * @author 刘汪洋 liuwangyang@corp.netease.com
 * @date 2018/06/01
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

     public enum Color{BLUE,RED,GREEN};

     Color fruitColor() default Color.GREEN;
}