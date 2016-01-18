package designpattern.Strategy.impl;

import designpattern.Strategy.IStrategy;

/**
 * Created by chenjunjun on 16/1/15 10:24
 */

//策略接口具体实现   妙计一：初到吴国
public class BackDoor implements IStrategy {
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
