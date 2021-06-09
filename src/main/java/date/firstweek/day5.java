package date.firstweek;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/4 - 9:06
 **/
public class day5 {
    public static void main(String[] args) {
        int[] nums = {2,3,-20,4,5,-1,-2,5,0,-11,-9};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
