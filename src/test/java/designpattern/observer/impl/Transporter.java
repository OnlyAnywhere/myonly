package designpattern.observer.impl;

import designpattern.observer.Watched;
import designpattern.observer.Watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjunjun on 16/1/15 09:43
 */

//运输车   具体的被观察者
public class Transporter implements Watched {

    private List<Watcher> list = new ArrayList<Watcher>();

    public void addWatcher(Watcher watcher)
    {
        list.add(watcher);
    }

    public void removeWatcher(Watcher watcher)
    {
        list.remove(watcher);
    }

    public void notifyWatchers() {
        for (Watcher watcher : list)
        {
            watcher.update();
        }
    }
}
