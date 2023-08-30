package old;

import java.lang.reflect.AnnotatedArrayType;
import java.util.function.DoublePredicate;

/**
 * @author Laurus
 * @Description
 * @ClassName old._前n个数字二进制中1的个数
 * @date 2023-05-10 21:21
 */
public class _前n个数字二进制中1的个数 {

    public int[] countBits(int n) {
        int[] dp = new int[n+1];
//
//        for (int i = 0; i <= n; i++) {
//            int ans = 0;
//            for (int j = 0; j < 32; j++) ans += (i >> j) & 1;
//            dp[i] = ans;
//        }
//        return dp;
        for (int i = 0; i <= n; i++)
        {
            dp[i] = dp[i >> 1] + (i & 1);
        }
        return dp;

    }
}
