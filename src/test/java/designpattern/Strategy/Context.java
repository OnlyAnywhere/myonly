package designpattern.Strategy;

/**
 * Created by chenjunjun on 16/1/15 10:28
 */

//环境类    利用多态 来接口客户端传过来的接口实现 来决定执行什么策略方法
public class Context {
    private IStrategy strategy;
    //构造函数，要你使用哪个妙计
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }
    public void operate(){
        this.strategy.operate();
    }
}
