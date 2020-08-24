package com.github.xingweixing.guanchazhe;

public class Observer implements IObserver {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + " 收到了通知【"+msg+"】");
    }
}
