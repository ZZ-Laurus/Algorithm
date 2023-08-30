package xin;

import java.util.Scanner;

/**
 * @author Laurus
 * @Description
 * @ClassName _二维数组中的查找
 * @date 2023-08-25 15:27
 */
public class _二维数组中的查找 {

    /**
     [1,2,8,9],
     [2,4,9,12],
     [4,7,10,13],
     [6,8,11,15]
    */
    public static boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int lie = array[0].length-1;
        int hang = 0;
        //从右上角逼近
        while (lie >= 0 && hang <= array.length-1){
            if(array[hang][lie] == target){
                return true;
            }
            else if(array[hang][lie] < target){
                hang++;
            }
            else if(array[hang][lie] > target){
                lie--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean find = Find(0, arr);
        System.out.println(find);
    }
}
