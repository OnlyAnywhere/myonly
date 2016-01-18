package designpattern.decorator.one;

/**
 * Created by chenjunjun on 16/1/15 17:04
 */
public class Person implements Human {
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

    public void walkToWhere() {
        System.out.println("去哪里呢。。");
    }
}
