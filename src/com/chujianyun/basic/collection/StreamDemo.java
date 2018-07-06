package com.chujianyun.basic.collection;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 刘汪洋
 * @date 2018/07/05
 */
public class StreamDemo {

    @Test
    public void setTest(){

        User user1 = new User("张三",23);

        User user2 = new User("张三",24);
        User user3 = new User("李四",35);
        Set<String> collect = Stream.of(user1, user2, user3).map(User::getName).distinct().collect(Collectors.toSet());
        collect.forEach(System.out::println);

    }

    @Test
    public void setTest2(){
        Map<String,Integer> map = new HashMap<>(3);
        map.put("12",222);
        map.put("13",222);
        map.put("14",222);

        Set<String> demo = Stream.of("12").collect(Collectors.toSet());
        map.keySet().removeAll(demo);
        Set<String> strings = map.keySet();
        strings.forEach(System.out::println);


    }

    @Test
    public void subTest(){
        List<String> list = Arrays.asList("1","2","7","8","5","6");
        List<String> collect = list.stream().sorted().skip(2).limit(2).collect(Collectors.toList());

    }
}
