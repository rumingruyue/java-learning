package com.chujianyun.basic.optional;

/**
 * @author 刘汪洋 liuwangyang@corp.netease.com
 * @date 2018/06/12
 */
public class Job {
    private String name;
    private Integer count;

    public Job() {
    }

    public Job(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
