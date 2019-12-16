package com.github.xingweixing.muban;

public abstract class Paper {
    public String quest1(){
        return "问题描述1，选项描述1，答案1" + answer1();
    }

    public String quest2(){
        return "问题描述2，选项描述2，答案1" + answer2();
    }

    public String quest3(){
        return "问题描述3，选项描述3，答案3" + answer3();
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
