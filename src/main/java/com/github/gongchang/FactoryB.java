package com.github.gongchang;

public class FactoryB implements IFactory {
    public IProduct produce() {
        return new ProductB();
    }
}
