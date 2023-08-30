package 数组;

import java.util.Arrays;

/**
 * @author Laurus
 * @Description
 * @ClassName _最短无序连续子数组
 * @date 2023-08-30 11:56
 */
public class _最短无序连续子数组 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int left = 0;
        int right = 0;
        int min = nums[nums.length-1];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) max = nums[i];
            else right = i;
            if(nums[nums.length-i-1]<min) min = nums.length-i-1;
            else left = nums.length-i-1;
        }
        return right-left+1;

    }
}
