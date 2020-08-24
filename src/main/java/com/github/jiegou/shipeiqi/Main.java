package com.github.jiegou.shipeiqi;

/**
 * 适配器模式
 * @author wendao76
 * @version 1.0
 * @description 类描述信息
 * @className Main
 * @date 2020-8-24 19:44
 */
public class Main {
  public static void main(String[] args) {
    //
    INewSourceApp sourceApp = new NewSourceAppImp();
    sourceApp.doSomething("eat");
  }
}
