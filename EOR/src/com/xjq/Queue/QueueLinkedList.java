package com.xjq.Queue;

import com.xjq.LinkedList.vo.SinglyLinkedList;

/*
 *@author：徐家庆
 *@time：2021-10-04 19:37
 *@description：
 *          队列---单链表实现
 */
public class QueueLinkedList<T> {
    SinglyLinkedList<T> head = new SinglyLinkedList<>();
    SinglyLinkedList<T> tail = head;
    int size = 0;

    /**
     * 入队列
     *
     * @param value 值
     */
    public void push(T value) {
        SinglyLinkedList<T> data = new SinglyLinkedList<>();
        data.setValue(value);
        tail.setNext(data);
        tail = data;
        size++;
    }

    /**
     * 出队列
     *
     * @return 弹出的值
     */
    public T pop() {
        if (size > 0) {
            SinglyLinkedList<T> data = head.getNext();
            head.setNext(data.getNext());
            size--;
            return data.getValue();
        }
        return null;
    }

    public static void main(String[] args) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        Integer pop = queue.pop();
        System.out.println(pop);
        queue.push(0);
        queue.push(1);
        System.out.println(queue.pop());
        queue.push(2);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
