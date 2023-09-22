package 数组;

/**
 * @author Laurus
 * @Description
 * @ClassName _27移除元素
 * @date 2023-09-21 11:54
 */
public class _27移除元素 {

    public  int removeElement(int[] nums, int val) {
        //前后指针
//        int fr = 0;
//        for (int af = 0; af < nums.length; af++) {
//            if(nums[af] != val){
//                nums[fr++] = nums[af];
//            }
//        }
//        return fr;

        //首尾指针
        int j = nums.length - 1;
        int i = 0;
       while (i<=j){
           if(nums[i] == val){
               swap(nums, i, j--);
           }else {
               i++;
           }
       }
       return j+1;
    }
    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    //输入：nums = [0,1,2,2,3,0,4,2], val = 2
    //输出：5, nums = [0,1,4,0,3]
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
//        removeElement(nums,2);
    }
}
