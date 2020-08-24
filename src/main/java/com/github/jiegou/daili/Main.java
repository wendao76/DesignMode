package com.github.jiegou.daili;

/**
 * 代理模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("小月月");
        Proxy proxy = new Proxy(girl);
        proxy.sendFlower();
    }
}
