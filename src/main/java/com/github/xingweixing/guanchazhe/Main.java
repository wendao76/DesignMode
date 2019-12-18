package com.github.xingweixing.guanchazhe;

public class Main {
    public static void main(String[] args) {
        IWatcher w1 = new Watcher("小明");
        IWatcher w2 = new Watcher("小红");
        IWatcher w3 = new Watcher("小刚");
        IWatched watched = new Watched();
        watched.addWatcher(w1);
        watched.addWatcher(w2);
        watched.addWatcher(w3);
        watched.noticeWatcher("测试一个通知");
        watched.noticeWatcher("第二个通知");
    }
}
