package sort;

/**
 * Created by chenjunjun on 16/1/20 15:47
 */
public class SF2 {
    public static int total(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (total(day + 1) + 1) * 2;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(total(1));
    }
}
