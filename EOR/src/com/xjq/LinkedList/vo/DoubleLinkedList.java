package com.xjq.LinkedList.vo;

/*
 *@author：徐家庆
 *@time：2021-10-03 16:24
 *@description：
 *          双向链表
 */
public class DoubleLinkedList<T> {
    private T value;

    private DoubleLinkedList<T> preNode;

    private DoubleLinkedList<T> nextNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleLinkedList<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(DoubleLinkedList<T> preNode) {
        this.preNode = preNode;
    }

    public DoubleLinkedList<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedList<T> nextNode) {
        this.nextNode = nextNode;
    }
}
