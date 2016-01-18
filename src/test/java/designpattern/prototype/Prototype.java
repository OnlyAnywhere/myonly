package designpattern.prototype;

/**
 * Created by chenjunjun on 16/1/15 15:59
 */
public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
