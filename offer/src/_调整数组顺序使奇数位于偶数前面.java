public class _调整数组顺序使奇数位于偶数前面 {

    public static int[] exchange(int[] nums) {

        if(nums == null){
            return nums;
        }

        for (int i = 0,j = nums.length-1;i < j;i++,j--){
            while (nums[i] % 2 == 1 && i<j){
                i++;

            }
            while (nums[j] % 2 == 0 && i<j){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,5};
        exchange(nums);
    }
}
