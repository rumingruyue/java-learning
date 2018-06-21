package com.chujianyun.basic.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author 刘汪洋 w1251314@sohu.com
 * @date 2018/06/14
 */
public class MapList {

    @Test
    public void demo(){
        Map<String,Set<Integer>> map = new HashMap<>(16);
        Set<Integer> firstSet = new HashSet<>(10);
        for (int i=0;i<10;i++){
            firstSet.add(i);
        }
        map.put("first",firstSet);

        Set<Integer> secondSet = new HashSet<>(10);
        for (int i=10;i<20;i++){
            secondSet.add(i);
        }
        map.put("second",secondSet);

        List<Inner> innerSet = new ArrayList<>();

        for(Map.Entry<String,Set<Integer>> entry : map.entrySet()){
            innerSet.add(new Inner(entry.getKey(),entry.getValue()));
        }
        System.out.println(innerSet.get(1).getName());
    }

    class Inner{
        private String name;
        private Set<Integer> content;

        public Inner() {
        }

        public Inner(String name, Set<Integer> content) {
            this.name = name;
            this.content = content;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Set<Integer> getContent() {
            return content;
        }

        public void setContent(Set<Integer> content) {
            this.content = content;
        }
    }
}
