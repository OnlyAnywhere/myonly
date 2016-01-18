package designpattern.Strategy;

import designpattern.Strategy.impl.BackDoor;
import designpattern.Strategy.impl.BlackEnemy;
import designpattern.Strategy.impl.GivenGreenLight;

/**
 * Created by chenjunjun on 16/1/15 10:28
 */
public class Zhaoyun {

    public static void main(String[] args) {
        Context context;

        System.out.println("----------刚到吴国使用第一个锦囊---------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("----------刘备乐不思蜀使用第二个锦囊---------------");
        context.setStrategy(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("----------孙权的追兵来了，使用第三个锦囊---------------");
        context.setStrategy(new BlackEnemy());
        context.operate();
        System.out.println("\n");
    }
}
