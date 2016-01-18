package designpattern.prototype;

/**
 * Created by chenjunjun on 16/1/15 16:00
 */
public class Client {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i< 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            System.out.println(clonecp);
            clonecp.show();
        }
    }
}
