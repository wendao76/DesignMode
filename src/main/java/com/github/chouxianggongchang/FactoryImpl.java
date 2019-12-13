package com.github.chouxianggongchang;

public class FactoryImpl implements IFactory{
    public IPlant producePlant() {
        return new Grass();
    }

    public IAnimal produceAmimal() {
        return new Dog();
    }
}
