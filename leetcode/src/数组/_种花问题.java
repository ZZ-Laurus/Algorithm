package 数组;


import com.sun.deploy.util.ArrayUtil;

/**
 * @author Laurus
 * @Description
 * @ClassName _种花问题
 * @date 2023-08-30 12:23
 */
public class _种花问题 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && 0 < n ) {
            if (flowerbed[i] == 1) {
                i+=2;
            } else if (i == flowerbed.length - 1 || flowerbed[i+1] == 0) {
                n--;
                i+=2;
            } else {
                i+=3;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1};
        canPlaceFlowers(nums,1);
    }
}
