package main.java.leetcode.answer;


import java.util.Random;
import main.java.leetcode.model.ListNode;

/**
 * 描述：给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *
 * @author zengqingquan
 * @date 2021/4/15 19:21
 */
public class AddTwoNumber {


    public static void main(String[] args) {

        ListNode listNode = new ListNode(9);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            listNode = new ListNode(random.nextInt(8)+1, listNode);
        }
        ListNode listNode2 = new ListNode(9);
        for (int i = 0; i < 3; i++) {
            listNode2 = new ListNode(random.nextInt(8)+1, listNode2);
        }
        ListNode result = ListNode.addTwoNumbers(listNode, listNode2);
        System.out.println(result);

    }




}
