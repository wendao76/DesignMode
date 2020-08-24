package com.github.gongchang;

/**
 * 工厂模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        ProductA productA = (ProductA)(new FactoryA()).produce();
        productA.showMe();
        ProductB productB = (ProductB)(new FactoryB()).produce();
        productB.showMe();
    }
}
