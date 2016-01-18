package designpattern.Strategy.impl;

import designpattern.Strategy.IStrategy;

/**
 * Created by chenjunjun on 16/1/15 10:25
 */

//策略接口具体实现    妙计三：孙夫人断后，挡住追兵
public class BlackEnemy implements IStrategy {
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
