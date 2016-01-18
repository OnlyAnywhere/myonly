package designpattern.construct;

/**
 * Created by chenjunjun on 16/1/15 10:46
 */
public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        Person manPerson = pd.constructPerson(new WomanBuilder());
    }
}
