package com.chujianyun.basic.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author 刘汪洋
 * @date 2018/06/27
 */
public class MapDemo {

    @Test
    public void getValue(){
        Map<String,Integer> map = new HashMap<>(2);
        map.put("dfdfd",3);

        System.out.println(map.keySet().contains("dfdf"));
        map.values().forEach(System.out::println);
    }

    @Test
    public  void mapTest(){
        List<String> strings = new ArrayList<>();


        Map<String, String> collect = strings.stream().collect(Collectors.toMap(String::toUpperCase, Function.identity()));

        for(Map.Entry<String,String> entry: collect.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
    }
}
