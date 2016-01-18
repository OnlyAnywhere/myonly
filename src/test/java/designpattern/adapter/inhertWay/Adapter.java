package designpattern.adapter.inhertWay;

/**
 * Created by chenjunjun on 16/1/15 16:10
 */

//适配器类，继承了被适配类，同时实现标准接口
public class Adapter extends Adaptee implements Target{
    public void request() {
        super.specificRequest();
    }
}
