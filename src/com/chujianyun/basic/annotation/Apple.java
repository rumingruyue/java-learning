package com.chujianyun.basic.annotation;

/**
 * @author 明明如月 w1251314@sohu.com
 * @date 2018/06/01
 */
public class Apple {

    @FruitName("苹果")
    private String appleName;


    @FruitColor(fruitColor = FruitColor.Color.BLUE)
    private String color;


    @FruitProvider(id = 1, name = "红富士",address = "西安市延安路")
    private String provider;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleName='" + appleName + '\'' +
                ", color='" + color + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
