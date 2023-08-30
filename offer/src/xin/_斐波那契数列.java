package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _斐波那契数列
 * @date 2023-08-25 16:46
 */
public class _斐波那契数列 {
    public int fib(int n) {

        //F(0) = 0,   F(1) = 1
        //F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

        int a = 0;
        int b = 1;
        int sum = 0;
        if(n == 0) return 0;
        if(n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            sum = (a+b)% 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
