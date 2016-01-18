package designpattern.factory.AbstractFactory;

/**
 * Created by chenjunjun on 16/1/15 13:01
 */
public class FactoryBMW320 implements AbstractFactory {
    public Engine createEngine() {
        return new EngineA();
    }
    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
