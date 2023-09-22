package 字符串;

/**
 * @author Laurus
 * @Description
 * @ClassName _151反转字符串中的单词
 * @date 2023-09-21 16:56
 */
public class _151反转字符串中的单词 {
    public String reverseWords(String s) {
        String[] split = s.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (int i = split.length-1; i >= 0 ; i--) {
            builder.append(split[i]).append(" ");
        }
        return builder.toString().trim();
    }
}
