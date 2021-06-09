package date.secondweek;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/7 - 9:12
 **/
public class day1 {
    public static int climbStairs(int n){
        if (n <= 2){
            return n;
        }
        int n1 =1;
        int n2 =2;
        for (int i = 3; i <= n; i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }
}
