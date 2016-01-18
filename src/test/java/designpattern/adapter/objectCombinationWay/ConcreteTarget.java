package designpattern.adapter.objectCombinationWay;



/**
 * Created by chenjunjun on 16/1/15 16:09
 */

//具体目标类，只提供普通功能
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}
