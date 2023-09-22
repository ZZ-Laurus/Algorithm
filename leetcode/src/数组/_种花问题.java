package 数组;


import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");

        //next():只读取输入直到空格。
        String str = sc.next();

        //nextLine():读取输入，包括单词之间的空格和除回车以外的所有符号
        String str2 = sc.nextLine();

        System.out.println("str：" + str);
        System.out.println("str2：" + str2);

        //关闭
        sc.close();

    }
}
