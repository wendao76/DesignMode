package com.github.xingweixing.guanchazhe;

public class Watcher implements IWatcher {
    private String name;
    public Watcher(String name) {
        this.name = name;
    }
    @Override
    public void update(String msg) {
        System.out.println(name + " 收到了通知【"+msg+"】");
    }
}
