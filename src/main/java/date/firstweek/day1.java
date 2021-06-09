package date.firstweek;

import java.util.Scanner;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/5/31 - 11:10
 **/
/*
    342. 4的幂
 */
public class day1 {
    public static boolean isPowerOfFour(int n){
        int count = 0;
        int m = n;
        while(m > 0){
            m = m >> 1;
            count++;
        }
        return count%2 == 1 && n >0 && (n&(n-1)) == 0;
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPowerOfFour(n));
    }
}
