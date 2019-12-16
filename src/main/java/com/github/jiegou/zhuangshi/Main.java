package com.github.jiegou.zhuangshi;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        DecoratorA decoratorA = new DecoratorA();
        DecoratorB decoratorB = new DecoratorB();
        decoratorA.setBeDecrator(person);
        decoratorB.setBeDecorator(decoratorA);
        decoratorB.operation();
    }
}
