package com.github.xingweixing.guanchazhe;

public interface IObservable {
    void addObserver(IObserver watcher);
    void removeObserver(IObserver watcher);
    void noticeObserver(String msg);
}
