package com.github.yuanxing;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("劳斯莱斯", "白色");
        Car car2 = (Car)car.clone();
        System.out.println(car2.name);
    }
}
