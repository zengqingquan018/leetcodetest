package main.java.answer;

/**
 * 描述：A-Z 1-26;
 *
 * @author zengqingquan
 * @date 2021/4/21 9:20
 */
public class NumDecodings {

    public static int numDecodings(String s) {
        int a = 0;
        int b = 1;
        int c = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            c=0;
            if (s.charAt(i) != '0') {
                c += b;
            }
            if (i > 0 && s.charAt(i - 1) != '0' && (s.charAt(i - 1) -'0')* 10 + (s.charAt(i)-'0') <= 26) {
                c += a;
            }
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args) {


        //2
        System.out.println(numDecodings("12"));
        //3
        System.out.println(numDecodings("226"));

        //1
        System.out.println(numDecodings("10"));
        //1
        System.out.println(numDecodings("2101"));
        //3
        System.out.println(numDecodings("1201234"));
    }

}
