package xin;

/**
 * @author Laurus
 * @Description
 * @ClassName _数值的整数次方
 * @date 2023-08-25 17:55
 */
public class _数值的整数次方 {
    public double myPow(double x, int n) {

        if( n == 0) return 1.0;
        if( x == 0.0 ) return 0.0;//保证不同时为0，先处理各自为0的情况

        boolean flag = false;
        if(n<0){
            flag = true;
            n *= -1;
        }
        double res = x;
        for (int i = 2; i <= n; i++) {
            res *= x;
        }
        if(flag){
            return 1.0/res;
        }
        return res;
    }
}
