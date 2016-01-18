package designpattern.single.LazyManSingle;

/**
 * Created by chenjunjun on 16/1/15 13:56
 */

////懒汉式单例类.在第一次调用的时候实例化自己
public class Singleton {
    private Singleton() {}
    private static Singleton singleton=null;
    //静态工厂方法
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


    //1.在getInstance方法上加同步
    //public static synchronized Singleton getInstance() {
    //    if (single == null) {
    //        single = new Singleton();
    //    }
    //    return single;
    //}

    //2.双重检查锁定
    //public static Singleton getInstance() {
    //    if (singleton == null) {
    //        synchronized (Singleton.class) {
    //            if (singleton == null) {
    //                singleton = new Singleton();
    //            }
    //        }
    //    }
    //    return singleton;
    //}

    //3、静态内部类    这种比上面1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响。
    //private static class LazyHolder {
    //    private static final Singleton INSTANCE = new Singleton();
    //}
    //private Singleton (){}
    //public static final Singleton getInstance() {
    //    return LazyHolder.INSTANCE;
    //}
}
