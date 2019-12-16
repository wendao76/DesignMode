package com.github.jiegou.zhuangshi;

public class DecoratorA implements IDecrator {
    private IDecrator beDecrator;
    public DecoratorA() {

    }

    public void setBeDecrator(IDecrator beDecorator) {
        this.beDecrator = beDecorator;
    }

    public void operation() {
        beDecrator.operation();
        System.out.println("我是操作A");
    }
}
