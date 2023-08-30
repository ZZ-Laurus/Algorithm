package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _旋转数组的最小数字
 * @date 2023-08-25 16:40
 */
public class _旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        if(numbers.length == 1) return numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
