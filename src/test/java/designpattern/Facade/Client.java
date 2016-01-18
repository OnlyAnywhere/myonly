package designpattern.Facade;

/**
 * Created by chenjunjun on 16/1/15 18:01
 */
public class Client {

    public static void main(String[] args) {

        ModuleFacade facade = new ModuleFacade();
        facade.a1();
        facade.b1();
        facade.a1();
    }
}
