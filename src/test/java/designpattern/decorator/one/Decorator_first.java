package designpattern.decorator.one;

/**
 * Created by chenjunjun on 16/1/15 17:02
 */
public class Decorator_first extends Decorator {
    public Decorator_first(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看。。");
    }

    public void findPlaceOnMap() {
        System.out.println("在Map上找找。。");
    }

    @Override
    public void wearClothes() {
        // TODO Auto-generated method stub
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        // TODO Auto-generated method stub
        super.walkToWhere();
        findPlaceOnMap();
    }
}
