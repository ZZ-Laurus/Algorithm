import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "   Hello,   world!  ";
//        String trimmed = str.trim();                  // 去除字符串开头和结尾的空格
//        String[] words = trimmed.split("\\s+");
//        for (String word : words) {
//            System.out.println(word);
//        }
//        // 将字符串按照空格分隔成单词数组
//        String firstWord = words[0].substring(0, 1);  // 提取第一个单词的首字母
//        System.out.println(firstWord);                // 输出 "H"
        String s1 = new String("二哥") + new String("三妹");
        String s2 = str.intern();
        System.out.println(str == s2);

    }
}