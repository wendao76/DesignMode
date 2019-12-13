package com.github.jianzaozhe;

public class BuilderA implements IBuilder {
    private IProduct product = new Product();
    public void buildA() {
        product.setPartA("BuilderA.partA");
    }

    public void buildB() {
        product.setPartB("BuilderA.partB");
    }

    public void buildC() {
        product.setPartC("BuilderA.partC");
    }

    public IProduct getProduct() {
        return product;
    }
}
