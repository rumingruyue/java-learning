package com.chujianyun.basic.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author 刘汪洋 w1251314@sohu.com
 * @date 2018/06/12
 */
public class OptionalDemo {

    @Test
    public void test(){
        System.out.println(getJob());
    }

    private Job getJob(){
        Job soft = null;
        return Optional.ofNullable(soft).orElse(new Job("软件工程师",23));
    }
}
