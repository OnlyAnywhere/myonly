package designpattern.observer;

/**
 * Created by chenjunjun on 16/1/15 09:38
 */

//抽象的被观察者
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers();
}
