package com.github.jianzaozhe;

public class Main {
    public static void main(String[] args) {
        BuilderA builderA = new BuilderA();
        Director director = new Director(builderA);

        IProduct product = director.construct();
        System.out.println(product);

        BuilderB builderB = new BuilderB();
        Director director2 = new Director(builderB);
        IProduct product1 = director2.construct();
        System.out.println(product1);

    }
}
