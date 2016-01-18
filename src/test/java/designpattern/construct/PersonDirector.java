package designpattern.construct;

/**
 * Created by chenjunjun on 16/1/15 10:45
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
