package com.github.jiegou.zhuangshi;

public class DecoratorB implements IDecrator {
    private IDecrator beDecorator;
    public DecoratorB() {

    }

    public void setBeDecorator(IDecrator beDecorator) {
        this.beDecorator = beDecorator;
    }

    public void operation() {
        beDecorator.operation();
        System.out.println("我是操作B");
    }
}
