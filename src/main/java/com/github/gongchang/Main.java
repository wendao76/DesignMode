package com.github.gongchang;

public class Main {
    public static void main(String[] args) {
        ProductA productA = (ProductA)(new FactoryA()).produce();
        productA.showMe();
        ProductB productB = (ProductB)(new FactoryB()).produce();
        productB.showMe();
    }
}
