package xin;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Laurus
 * @Description
 * @ClassName _替换空格
 * @date 2023-08-25 16:05
 */
public class _替换空格 {

    public static String replaceSpace(String s) {

//    return s.replace(" ","%20");

        if(s == null || s.length() == 0){
            return s;
        }
        //双指针
        //计算总共需要的位置数
        char[] chars = s.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if(aChar == ' '){
                count++;
            }
        }
        char[] arr = new char[s.length()+2*count];
//        int front = chars.length-1;
        int after = arr.length;
        for (int i = chars.length-1; i > 0; i--) {
            if(chars[i] == ' '){
                arr[--after] = '0';
                arr[--after] = '2';
                arr[--after] = '%';
            }else {
                arr[--after] =chars[i];
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        String s = "we are happy.";
        String s1 = replaceSpace(s);
        System.out.println(s1);
    }
}
