package designpattern.single;

/**
 * Created by chenjunjun on 16/1/15 14:18
 */
public class TMain {

    public static void main(String[] args){
        TestSingleton ts1 = TestSingleton.getInstance();
        ts1.setName("jason");
        TestSingleton ts2 = TestSingleton.getInstance();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if(ts1 == ts2){
            System.out.println("创建的是同一个实例");
        }else{
            System.out.println("创建的不是同一个实例");
        }
    }
}

//the name is 0539
//the name is 0539
//创建的是同一个实例
/**
 * 结论：由结果可以得知单例模式为一个面向对象的应用程序提供了对象惟一的访问点，不管它实现何种功能，整个应用程序都会同享一个实例对象。

    对于单例模式的几种实现方式，知道饿汉式和懒汉式的区别，线程安全，资源加载的时机，还有懒汉式为了实现线程安全的3种方式的细微差别。
 */
