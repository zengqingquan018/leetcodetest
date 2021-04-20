package main.java.answer;

import com.sun.deploy.util.StringUtils;

/**
 * 描述：给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author zengqingquan
 * @date 2021/4/20 9:58
 */
public class lengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        // 开始指针
        int start = 0;
        int[] charAt = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            // 算出指针位置 没有出现过的char  char[tmp] = 0,指针保持不变 ，如果已经出现过，则开始指针跳到上次出现位置
            start = Math.max(start, charAt[tmp]);
            // 最大长度= 以前最大长度与现在长度取最大值  现在长度 当前指针减去上次位置指针。
            maxLength = Math.max(i - start , maxLength);
            //
            charAt[tmp] = i;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s1));
        String s2 = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s2));
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s3));
        String s4 = "";
        System.out.println(lengthOfLongestSubstring(s4));
    }
}
