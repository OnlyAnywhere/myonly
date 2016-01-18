package designpattern.observer.impl;

import designpattern.observer.Watcher;

/**
 * Created by chenjunjun on 16/1/15 09:42
 */

//警察  具体的观察者
public class Police implements Watcher {

    public void update() {
        System.out.println("运输车有行动,警察护航");
    }
}
