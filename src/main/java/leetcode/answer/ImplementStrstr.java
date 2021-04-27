package main.java.leetcode.answer;

/**
 * 描述：实现 strStr() 函数。
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 * <p>
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zengqingquan
 * @date 2021/4/20 9:34
 */
public class ImplementStrstr {


    //4 2
    public static int strStr(String haystack, String needle) {
        if (null == needle || needle.length() == 0) {
            return 0;
        }
        if (null == haystack || haystack.length() == 0 || haystack.length() < needle.length()) {
            return -1;
        }
       // return  haystack.indexOf(needle);
        int length = haystack.length() - needle.length() + 1;
        //5  2
        for (int i = 0; i < length; i++) {
            String tmp = haystack.substring(i,i+needle.length());
            if (tmp.equals(needle)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
       String haystack = "hello"; String needle = "ll";
        System.out.println(strStr(haystack,needle));
        System.out.println(strStr("aaaaa","bba"));
        System.out.println(strStr("",""));
    }
}
