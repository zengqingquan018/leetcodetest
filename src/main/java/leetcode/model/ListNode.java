package main.java.leetcode.model;


/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/4/19 9:21
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int addNumber) {
        if (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            int tmp = a + b + addNumber;
            if (l1 == null) {
                l1 = new ListNode(tmp % 10, l2);
                l2 = null;
            } else {
                l1.val = tmp % 10;
            }
            addNumber = tmp / 10;
            l1.next = addTwoNumbers(l1.next, null == l2 ? null : l2.next, addNumber);
        } else {
            return addNumber == 0 ? null : new ListNode(addNumber);
        }
        return l1;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a++;
        System.out.println(a);
        System.out.println(b);
        int [][] c = new  int[2][2];
        c[1][1] = 5;
        c[0][0] =  c[1][1];
        c[1][1]=33;
        System.out.println(c[0][0]);
     }
}

