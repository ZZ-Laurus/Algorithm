package 数组;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Laurus
 * @Description
 * @ClassName _第三大的数
 * @date 2023-08-26 20:23
 */
public class _第三大的数 {
    public static int thirdMax(int[] nums) {
        //先去重
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        //小于两个
        for (int num : nums) {
            set.add(num);
        }
        if(set.size()<3){
            int res = 0;
            for (Integer integer : set) {
                if(integer>res){
                    res = integer;
                }
            }
            return res;
        }
        Object[] objects = set.toArray();
        int res = (int) objects[set.size()-2];
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        thirdMax(nums);
    }
}
