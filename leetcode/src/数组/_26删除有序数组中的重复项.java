package 数组;

/**
 * @author Laurus
 * @Description
 * @ClassName _26删除有序数组中的重复项
 * @date 2023-09-21 12:05
 */
public class _26删除有序数组中的重复项 {

    public static int removeDuplicates(int[] nums) {
        //前后指针
        int fr = 0;
        for (int af = 0; af < nums.length; af++) {
            if(nums[af] != nums[fr]){
                nums[++fr] = nums[af];
            }
        }
        return fr+1;


    }
    //输入：nums = [0,0,1,1,1,2,2,3,3,4]
    //输出：5, nums = [0,1,2,3,4]
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
