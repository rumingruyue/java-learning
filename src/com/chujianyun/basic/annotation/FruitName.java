package com.chujianyun.basic.annotation;

import java.lang.annotation.*;

/**
 * @author 明明如月 w1251314@sohu.com
 * @date 2018/06/01
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    String value() default "";
}
