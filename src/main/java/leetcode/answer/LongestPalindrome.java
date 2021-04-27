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
            char[] charArrar = s.toCharArray();
            boolean [][] resultArrar = new boolean[length][length];
            // i为子串长度
            for (int i = 2; i < length; i++) {
                for (int j = 0; j < length - i; j++) {
                    if (charArrar[j]!=charArrar[i+j-1]){

                    }
                }
            }
            return null;
        }



    public static void main(String[] args) {
        String s = "adcda";
        System.out.println(longestPalindrome(s));
    }
}
