package 数组;

/**
 * @author Laurus
 * @Description
 * @ClassName 数组._704二分查找
 * @date 2023-05-10 21:47
 */
public class _704二分查找 {

    public int search(int[] nums, int target) {
        if(target>nums[nums.length-1]||target < nums[0]){
            return -1;
        }
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left+right) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
