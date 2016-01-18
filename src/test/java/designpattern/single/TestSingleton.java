package designpattern.single;

/**
 * Created by chenjunjun on 16/1/15 14:17
 */

//以下是一个单例类使用的例子，以懒汉式为例，这里为了保证线程安全，使用了双重检查锁定的方式：
public class TestSingleton {
    String name = null;

    private TestSingleton() {
    }

    private static volatile TestSingleton singleton = null;

    public static TestSingleton getInstance() {
        if (singleton == null) {
            synchronized (TestSingleton.class) {
                if (singleton == null) {
                    singleton = new TestSingleton();
                }
            }
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }

}
