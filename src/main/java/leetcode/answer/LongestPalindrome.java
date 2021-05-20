package main.java.leetcode.answer;

/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/4/22 18:11
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        int length = s.length();
        int maxLength = 1;
        int begin = 0;
        char[] charArrar = s.toCharArray();
        boolean[][] resultArrar = new boolean[length][length];
        // i为子串长度
        for (int i = 2; i < length; i++) {
            // j为起始值
            for (int j = 0; j < length - i; j++) {
                if (charArrar[j] != charArrar[i + j - 1]) {
                    resultArrar[i][j] = false;
                } else {
                    if (i - 1 < 3) {
                        resultArrar[i][j] = true;
                        maxLength = i - 1;
                    } else {
                        resultArrar[i][j] = resultArrar[i - 1][j + 1];
                    }
                }
                if (resultArrar[i][j] && i > maxLength) {
                    maxLength = i;
                    begin = j;
                }
            }
        }
        return s.substring(begin, begin + maxLength);
    }


    public static void main(String[] args) {
        String s = "adcda";
        System.out.println(longestPalindrome(s));
        s = "babad";
        System.out.println(longestPalindrome(s));
        s="ac";
        System.out.println(longestPalindrome(s));
    }
}
