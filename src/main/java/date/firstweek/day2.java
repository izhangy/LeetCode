package date.firstweek;

import com.sun.org.apache.xpath.internal.objects.XNull;

import java.util.Scanner;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/1 - 9:20
 **/
//查找两数之和为指定目标值的下标
public class day2 {
    public static int[] twoSum(int[] nums, int target){
        if (nums == null || nums.length == 0){
            return new int[0];  //new int[0]表示动态分配一个长度为0的int数组
        }
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            //线性查找
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == target - x){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int target=3;
        int[] n = new int[]{1,2,3,4};
        System.out.println(twoSum(n, target));
    }
}
