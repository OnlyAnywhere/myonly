package designpattern.decorator.two;

/**
 * Created by chenjunjun on 16/1/15 17:07
 */

//鸡腿堡类（被装饰者的初始状态，有些自己的简单装饰，相当于上面的Person）
public class ChickenBurger extends Humburger {
    public ChickenBurger(){
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
