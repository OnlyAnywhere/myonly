package sort;

/**
 * Created by chenjunjun on 16/1/20 10:21
 */
public class SF1 {
    static int ts=0;//桃子总数
    int fs=1;//记录分的次数
    static int hs=5;//猴子数...
    int tsscope=6000;//桃子数的取值范围.太大容易溢出.
    public int fT(int t){
        if(t==tsscope){
            //当桃子数到了最大的取值范围时取消递归
            System.out.println("结束");
            return 0;
        }else{
            if((t-1)%hs==0 && fs <=hs){
                if(fs==hs){
                        System.out.println("桃子数 = "+ts +" 时满足分桃条件");
                }
                fs+=1;
                return fT((t-1)/5*4);// 返回猴子拿走一份后的剩下的总数
            }else{
                        //没满足条件
                //System.out.println("桃子数 = "+ts +" 时没满足条件");
                fs=1;//分的次数重置为1
                return fT(ts+=1);//桃子数加+1
            }
        }
    }
    public static void main(String[] args) {
        new SF1().fT(0);
    }
}
