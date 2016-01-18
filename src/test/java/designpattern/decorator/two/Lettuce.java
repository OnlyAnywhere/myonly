package designpattern.decorator.two;

/**
 * Created by chenjunjun on 16/1/15 17:19
 */
public class Lettuce extends Condiment {

    Humburger humburger;

    public Lettuce(Humburger humburger){
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }
}
