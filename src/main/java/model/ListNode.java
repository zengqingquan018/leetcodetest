package main.java.model;

/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/3/26 10:36
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
