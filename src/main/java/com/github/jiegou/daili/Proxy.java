package com.github.jiegou.daili;

public class Proxy implements IGiveFlower {
    private IGiveFlower boy;
    public Proxy(Girl girl) {
        this.boy = new Boy(girl);
    }

    public void sendFlower() {
        boy.sendFlower();
    }
}
