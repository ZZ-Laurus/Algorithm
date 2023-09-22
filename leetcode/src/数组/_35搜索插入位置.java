package 数组;

/**
 * @author Laurus
 * @Description
 * @ClassName _35搜索插入位置
 * @date 2023-09-20 17:48
 */
public class _35搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right+1;
    }
}
