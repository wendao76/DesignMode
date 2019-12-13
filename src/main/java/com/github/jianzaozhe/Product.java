package com.github.jianzaozhe;

public class Product implements IProduct {
    private String partA;

    private String partB;

    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void showThis() {
        System.out.println(partA + "\n" + partB + "\n" + partC + "\n");
    }
}
