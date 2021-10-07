package com.xjq.LinkedList.vo;

/*
 *@author：徐家庆
 *@time：2021-10-02 09:33
 *@description：
 *          单向链表
 */
public class SinglyLinkedList<T> {
    // 数据区域
    private T value;

    // 下个节点
    private SinglyLinkedList<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SinglyLinkedList<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedList<T> next) {
        this.next = next;
    }
}
