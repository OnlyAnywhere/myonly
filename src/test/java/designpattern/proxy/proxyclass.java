package designpattern.proxy;

/**
 * Created by chenjunjun on 16/1/15 10:00
 */

//people类不能拥有车，必须经过proxy代理类的认证，符合条件之后才可以拥有车辆，新建一个代理，这个代理类来考察当前的people是否有资格进行买车：
public class proxyclass implements buy_car {
    private people people;
    public people getPeople(){
        return people;
    }
    public void setPeople(people people){
        this.people = people;
    }

    public void buy_mycar() {
        if (people.getVip() == "vip"){
            people.buy_mycar();
            return ;
        }
        if(people.getCash()>=50000){
            System.out.println(people.getUsername()+"买了新车，交易结束！");
        }
        else
        {
            System.out.println(people.getUsername()+"钱不够，不能买车，继续比赛！");
        }
    }
}
