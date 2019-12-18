package com.github.xingweixing.guanchazhe;

public interface IWatched {
    void addWatcher(IWatcher watcher);
    void removeWatcher(IWatcher watcher);
    void noticeWatcher(String msg);
}
