package designpattern.construct;

/**
 * Created by chenjunjun on 16/1/15 10:40
 */
public interface PersonBuilder {

    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
