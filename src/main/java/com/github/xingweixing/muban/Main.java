package com.github.xingweixing.muban;

/**
 * 模板方法模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        PaperA paperA = new PaperA();
        System.out.println(paperA.quest1());
        System.out.println(paperA.quest2());
        System.out.println(paperA.quest3());

        PaperB paperB = new PaperB();
        System.out.println(paperB.quest1());
        System.out.println(paperB.quest2());
        System.out.println(paperB.quest3());
    }
}
