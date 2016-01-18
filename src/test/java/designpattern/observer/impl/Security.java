package designpattern.observer.impl;

import designpattern.observer.Watcher;

/**
 * Created by chenjunjun on 16/1/15 09:39
 */

//保镖  具体观察者
public class Security implements Watcher {

    public void update() {
        System.out.println("运输车有行动,保安贴身保护");
    }
}
