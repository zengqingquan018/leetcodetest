package main.java.learn.singleton;

/**
 * 描述：
 *
 * @author zengqingquan
 * @date 2021/4/28 18:38
 */
public class Main {

    public static void main(String[] args) {
        Node<Integer> a ;
        Node<Integer> b ;
        a =b= new Node<>(null);
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(1);
        a = a.next = node;
        a = a.next = node2;
        System.out.println("1111");
    }

    static class Node<E> {
        E item;

        /**
         * One of:
         * - the real successor Node
         * - this Node, meaning the successor is head.next
         * - null, meaning there is no successor (this is the last node)
         */
        Node<E> next;

        Node(E x) { item = x; }
    }
}
