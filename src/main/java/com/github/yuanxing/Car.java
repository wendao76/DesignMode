package com.github.yuanxing;

/**
 * @author wendao76
 */
public class Car implements Cloneable{
    public String name;
    public String color;
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
