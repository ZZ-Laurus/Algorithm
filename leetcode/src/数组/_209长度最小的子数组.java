package 数组;

import sun.security.mscapi.CKeyPairGenerator;
import sun.security.rsa.RSASignature;

import javax.swing.text.StyleContext;

/**
 * @author Laurus
 * @Description
 * @ClassName _209长度最小的子数组
 * @date 2023-09-21 16:37
 */
public class _209长度最小的子数组 {

    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum>target){
                res = Math.min(res,right-left+1);
                sum-= nums[left];
            }
        }
        return res == Integer.MAX_VALUE ? 0: res;
    }
}
