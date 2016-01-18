package designpattern.decorator.one;

/**
 * Created by chenjunjun on 16/1/15 16:27
 */

//定义装饰者
public abstract class Decorator implements Human{
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    public void wearClothes() {
        human.wearClothes();
    }

    public void walkToWhere() {
        human.walkToWhere();
    }

}
