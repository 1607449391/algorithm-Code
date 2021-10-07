package com.xjq.Stack;

import com.xjq.LinkedList.vo.SinglyLinkedList;

/*
 *@author：徐家庆
 *@time：2021-10-04 20:32
 *@description：
 *          栈---单链表实现
 */
public class StackLinkedList<T> {
    private SinglyLinkedList<T> head = new SinglyLinkedList<>();

    /**
     * 入栈
     *
     * @param value 值
     */
    public void push(T value) {
        SinglyLinkedList<T> data = new SinglyLinkedList<>();
        data.setValue(value);
        data.setNext(head.getNext());
        head.setNext(data);
    }

    /**
     * 出栈
     *
     * @return 值
     */
    public T pop() {
        SinglyLinkedList<T> data = head.getNext();
        if (data != null) {
            head.setNext(data.getNext());
            return data.getValue();
        }
        return null;
    }

    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        System.out.println(stack.pop());
        stack.push(0);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
