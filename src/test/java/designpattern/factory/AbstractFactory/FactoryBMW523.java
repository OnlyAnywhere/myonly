package designpattern.factory.AbstractFactory;

/**
 * Created by chenjunjun on 16/1/15 13:02
 */
public class FactoryBMW523 implements AbstractFactory {

    public Engine createEngine() {
        return new EngineB();
    }
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
