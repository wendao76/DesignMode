package com.github.xingweixing.guanchazhe;

/**
 * 观察者模式
 * @author wendao76
 */
public class Main {
    public static void main(String[] args) {
        IObserver w1 = new Observer("小明");
        IObserver w2 = new Observer("小红");
        IObserver w3 = new Observer("小刚");
        IObservable watched = new ObservableSubject();
        watched.addObserver(w1);
        watched.addObserver(w2);
        watched.addObserver(w3);
        watched.noticeObserver("测试一个通知");
        watched.noticeObserver("第二个通知");
    }
}
