package com.github.jiegou.daili;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("小月月");
        Proxy proxy = new Proxy(girl);
        proxy.sendFlower();
    }
}
