package com.github.gongchang;

public class FactoryA implements IFactory {
    public IProduct produce() {
        return new ProductA();
    }
}
