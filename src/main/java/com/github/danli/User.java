package com.github.danli;

/**
 *
 */
public class User {
    private static User instance;
    private User() {

    }
    public static User getInstance() {
        if(instance == null) {
            instance = new User();
        }
        return instance;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
