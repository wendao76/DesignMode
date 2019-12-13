package com.github.jianzaozhe;

public class BuilderB implements IBuilder {
    private IProduct product = new Product();
    public void buildA() {
        product.setPartA("BuilderB.partA");
    }

    public void buildB() {
        product.setPartB("BuilderB.partB");
    }

    public void buildC() {
        product.setPartC("BuilderB.partC");
    }

    public IProduct getProduct() {
        return product;
    }
}
