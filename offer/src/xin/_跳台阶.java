package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _跳台阶
 * @date 2023-08-25 16:54
 */
public class _跳台阶 {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int i = climbStairs(2);
        System.out.println(i);
    }
}
