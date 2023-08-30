package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _二进制中1的个数
 * @date 2023-08-25 17:45
 */
public class _二进制中1的个数 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            n = n & (n-1);
            res++;
        }
        return res;
    }
}
