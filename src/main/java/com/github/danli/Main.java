package com.github.danli;

/**
 * 单例模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        User user  = User.getInstance();
        user.sayHello("wendao");
    }
}
