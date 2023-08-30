package old;

public class _翻转单词顺序 {

    public String reverseWords(String s) {
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
            if(strs[i].equals("")) continue; // 遇到空单词则跳过
            res.append(strs[i] + " "); // 将单词拼接至 StringBuilder
        }
        return res.toString().trim(); // 转化为字符串，删除尾部空格，并返回

    }

    public static void main(String[] args) {
        String s = "a good   example";
        String[] s1 = s.split(" ");
        for (String s2 : s1) {
            System.out.println(s2);
        }
    }
}
