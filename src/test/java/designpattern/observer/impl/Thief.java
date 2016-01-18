package designpattern.observer.impl;

import designpattern.observer.Watcher;

/**
 * Created by chenjunjun on 16/1/15 09:40
 */

//强盗  具体的观察者
public class Thief implements Watcher {

    public void update() {
        System.out.println("运输车有行动,强盗准备动手");
    }
}
