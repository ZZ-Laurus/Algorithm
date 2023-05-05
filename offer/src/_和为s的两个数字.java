import java.util.HashMap;

public class _和为s的两个数字 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                res[0] = nums[i];
                Integer integer = map.get(target - nums[i]);
                res[1] = integer;
            }
            map.put(nums[i],nums[i]);
        }
        return res;
    }
}
