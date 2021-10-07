package com.xjq.LinkedList;

import com.xjq.LinkedList.vo.DoubleLinkedList;

/*
 *@author：徐家庆
 *@time：2021-10-03 17:25
 *@description：
 *          双向链表练习
 */
public class LinkedListClass02 {

    /**
     * 双向链表初始化
     *
     * @return 链表头
     */
    private static DoubleLinkedList<Integer> init() {
        DoubleLinkedList<Integer> head = new DoubleLinkedList<>();
        DoubleLinkedList<Integer> cur = null;
        DoubleLinkedList<Integer> pre = head;
        for (int i = 0 ; i < 5 ; i++) {
            cur =  new DoubleLinkedList<>();
            cur.setValue(i);
            cur.setPreNode(pre);
            pre.setNextNode(cur);
            pre = cur;
        }
        return head;
    }

    /**
     * 双向链表反转
     *
     * @param head
     * @return
     */
    public static DoubleLinkedList<Integer> reverseDoubleLinkedList(DoubleLinkedList<Integer> head) {
        DoubleLinkedList<Integer> pre = null;
        head = head.getNextNode();
        DoubleLinkedList<Integer> next = null;
        while (head !=  null) {
            next = head.getNextNode();
            head.setNextNode(pre);
            if (pre != null)
                pre.setPreNode(head);
            pre = head;
            head = next;
        }
        DoubleLinkedList<Integer> last = new DoubleLinkedList<>();
        last.setNextNode(pre);
        pre.setPreNode(last);
        return last;
    }

    /**
     * 删除双向链表中的某个值
     *
     * @param head 链表头部
     * @param value 删除的值
     * @return 删除后的链表
     */
    public static DoubleLinkedList<Integer> deleteOne(DoubleLinkedList<Integer> head, Integer  value) {
        DoubleLinkedList<Integer> pre = head;
        DoubleLinkedList<Integer> cur = head.getNextNode();
        while (cur != null) {
            if (cur.getValue() ==  value) {
                pre.setNextNode(cur.getNextNode());
                cur.getNextNode().setPreNode(pre);
                cur = pre.getNextNode();
            } else {
                pre = cur;
                cur = cur.getNextNode();
            }
        }
        return head;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> head = init();
        DoubleLinkedList<Integer> reverse = deleteOne(head, 3);
        reverse = reverse.getNextNode();
        while (reverse != null) {
            System.out.println(reverse.getValue());
            reverse = reverse.getNextNode();
        }
    }
}
