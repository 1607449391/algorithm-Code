package com.xjq.Queue;

/*
 *@author：徐家庆
 *@time：2021-10-04 19:54
 *@description：
 *          队列--数组实现
 */
public class QueueArray<T> {
    // 队列
    private Object[] data;

    // 队列大小
    private int size;

    // 队列头部
    private int head;

    // 队列尾部
    private int tail;

    //队列默认大小
    private static final int DEFAULT_CAPACITY = 5;

    public QueueArray() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
        head = -1;
        tail = -1;
    }

    public QueueArray(int capacity) {
        size = 0;
        data = new Object[capacity];
        head = -1;
        tail = -1;
    }

    private int getNextSize(int flag) {
        return flag + 1 < data.length ? flag + 1 : (flag + 1) % data.length;
    }

    /**
     * 入队列
     *
     * @param value 入队列的值
     */
    public void push(T value) {
        if (size + 1 <=  data.length) {
            tail = getNextSize(tail);
            data[tail] = value;
            size ++;
            return;
        }
        System.out.println("插入失败，队列已满");
    }

    /**
     * 出队列
     *
     * @return 出队列元素
     */
    public T pop() {
        if (size > 0) {
            head =  getNextSize(head);
            size--;
            return (T)data[head];
        }
        System.out.println("队列为空！");
        return null;
    }

    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<>();
        System.out.println(queue.pop());
        queue.push(0);
        queue.push(1);
        System.out.println(queue.pop());
        queue.push(2);
        System.out.println(queue.pop());
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);
        System.out.println(queue.pop());
    }
}
