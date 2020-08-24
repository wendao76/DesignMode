package com.github.jiegou.daili;

public class Boy implements IGiveFlower{
    private Girl mm;
    public Boy(Girl girl) {
        this.mm = girl;
    }
    @Override
    public void sendFlower() {
        System.out.println(this.mm.name + "送你鲜花");
    }
}
