package com.github.chouxianggongchang;

/**
 * 抽象工厂模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        FactoryImpl factory = new FactoryImpl();
        Dog dog = (Dog)factory.produceAmimal();
        dog.eat();

        Grass grass = (Grass)factory.producePlant();
        grass.grow();
    }
}
