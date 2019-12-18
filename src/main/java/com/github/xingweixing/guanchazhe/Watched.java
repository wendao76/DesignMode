package com.github.xingweixing.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class Watched implements IWatched {
    private List<IWatcher> watchers = new ArrayList<>();
    @Override
    public void addWatcher(IWatcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(IWatcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void noticeWatcher(String msg) {
        watchers.forEach(watcher -> {
            watcher.update(msg);
        });
    }
}
