package 数组;

/**
 * @author Laurus
 * @Description
 * @ClassName _283移动零
 * @date 2023-09-21 16:12
 */
public class _283移动零 {

    public static void moveZeroes(int[] nums) {
//        int i = 0;
//        int j = nums.length-1;
//        while (i<=j){
//            if(nums[i] == 0){
//                swap(nums,i,j--);
//            }else {
//                i++;
//            }
//        }
        //快慢指针
        int fr = 0;
        for (int af = 0; af < nums.length; af++) {
            if(nums[af] != 0){
                swap(nums,af,fr++);
            }
        }
    }

    static void  swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {

    }
}
