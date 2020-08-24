package com.github.xingweixing.guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class ObservableSubject implements IObservable {
    private List<IObserver> watchers = new ArrayList<>();
    @Override
    public void addObserver(IObserver watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeObserver(IObserver watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void noticeObserver(String msg) {
        watchers.forEach(watcher -> {
            watcher.update(msg);
        });
    }
}
