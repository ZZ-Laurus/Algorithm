package old;

import java.util.HashMap;

/**
 * @author Laurus
 * @Description
 * @ClassName old._连续子数组的最大和
 * @date 2023-05-10 21:53
 */
public class _连续子数组的最大和 {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
    }
}
