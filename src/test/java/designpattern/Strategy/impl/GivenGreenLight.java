package designpattern.Strategy.impl;

import designpattern.Strategy.IStrategy;

/**
 * Created by chenjunjun on 16/1/15 10:25
 */

//策略接口具体实现   妙计二：求吴国太开绿灯放行
public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
