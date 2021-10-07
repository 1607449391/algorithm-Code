package com.xjq.LinkedList;

import com.xjq.LinkedList.vo.SinglyLinkedList;

/*
 *@author：徐家庆
 *@time：2021-10-02 09:30
 *@description：
 *          单链表练习
 *
 */
public class LinkedListClass01 {
    /**
     * 初始化链表
     *
     * @return 链表头部
     */
    private static SinglyLinkedList<Integer> initLinkedList() {
        SinglyLinkedList<Integer> head = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> curNode = head;
        SinglyLinkedList<Integer> nextNode = null;
        head.setValue(0);
        for (int i = 1 ; i < 5 ; i++) {
            nextNode = new SinglyLinkedList<>();
            curNode.setNext(nextNode);
            nextNode.setValue(i);
            curNode = nextNode;
        }
        curNode.setNext(null);
        return head;
    }

    /**
     * 单链表反转练习
     *
     * @param head 链表头
     * @return  反转后的链表头
     */
    public static SinglyLinkedList<Integer> reverseLinkedList(SinglyLinkedList<Integer> head) {
        SinglyLinkedList<Integer> curNode = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> nextNode = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> flagNode = new SinglyLinkedList<>();
        curNode = head;
        nextNode = head.getNext();
        while (nextNode != null) {
            flagNode = nextNode.getNext();
            nextNode.setNext(curNode);
            curNode = nextNode;
            nextNode = flagNode;
        }
        head.setNext(null);
        return curNode;
    }

    /**
     * 单链表反转 答案
     *
     * @param head 表头
     * @return 反转的表头
     */
    public static SinglyLinkedList<Integer> reverseLinkedListAnswer(SinglyLinkedList<Integer> head) {
        SinglyLinkedList<Integer> preNode = null;
        SinglyLinkedList<Integer> nextNode = null;
        while (head != null) {
            nextNode =  head.getNext();
            head.setNext(preNode);
            preNode = head;
            head =  nextNode;
        }
       return preNode;
    }

    /**
     * 单链表删除某个值（头节点含有数据）
     *
     * @param head 链表头
     * @param value  删除的值
     * @return 删除后的链表值
     */
    public static SinglyLinkedList<Integer> deleteOne(SinglyLinkedList<Integer> head, Integer value) {
        SinglyLinkedList<Integer> cur = null;
        SinglyLinkedList<Integer> pre = null;
        while (head != null && head.getValue() == value)  {
            head = head.getNext();
        }
        cur = head.getNext();
        pre = head;
        while (cur != null) {
            if (cur.getValue() == value) {
                pre.setNext(cur.getNext());
            }
            pre = cur;
            cur = cur.getNext();
        }
        return head;

    }

    /**
     * 单链表删除某个值（头节点不含有数据）
     *
     * @param head 链表头
     * @param value  删除的值
     * @return 删除后的链表值
     */
    public static SinglyLinkedList<Integer> deleteOne01(SinglyLinkedList<Integer> head, Integer value) {
        SinglyLinkedList<Integer> cur = null;
        SinglyLinkedList<Integer> pre = null;
        cur = head.getNext();
        pre = head;
        while (cur != null) {
            if (cur.getValue() == value) {
                pre.setNext(cur.getNext());
            }
            pre = cur;
            cur = cur.getNext();
        }
        return head;

    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> head = initLinkedList();
        SinglyLinkedList<Integer> reverseNode = deleteOne(head, 3);
        while (reverseNode != null) {
            System.out.println("值：" + reverseNode.getValue());
            reverseNode = reverseNode.getNext();
        }
    }
}
