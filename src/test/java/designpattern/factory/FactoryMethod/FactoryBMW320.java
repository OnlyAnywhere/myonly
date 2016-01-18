package designpattern.factory.FactoryMethod;

/**
 * Created by chenjunjun on 16/1/15 11:20
 */
public class FactoryBMW320 implements FactoryBMW {
    public BMW320 createBMW() {

        return new BMW320();
    }
}
