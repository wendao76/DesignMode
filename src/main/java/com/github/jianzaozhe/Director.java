package com.github.jianzaozhe;

public class Director {
    private IBuilder builder;
    public Director(IBuilder builder) {
        this.builder = builder;
    }

    public IProduct construct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}
