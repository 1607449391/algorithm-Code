package com.xjq.Queue;

/*
 *@author：徐家庆
 *@time：2021-10-04 21:20
 *@description：
 *          利用队列实现栈的功能
 */
public class QueueConvertStack<T> {
    // 主队列
    private QueueArray<T> masterQueue;

    // 辅助队列
    private QueueArray<T> assistQueue;

    // 当前容量
    private int size;

    // 自定义容量大小
    private int customCapacity;

    // 默认大小
    private static final int DEFAULT_CAPACITY = 5;

    public QueueConvertStack() {
        masterQueue = new QueueArray<T>(DEFAULT_CAPACITY);
        assistQueue = new QueueArray<T>(DEFAULT_CAPACITY);
        size = 0;
        customCapacity = DEFAULT_CAPACITY;
    }

    public QueueConvertStack(int capacity) {
        customCapacity = capacity;
        masterQueue = new QueueArray<>(capacity);
        assistQueue = new QueueArray<>(capacity);
        size =  0;
    }

    /**
     * 入栈
     *
     * @param value 值
     */
    public void push(T value) {
        if (size + 1 <= customCapacity) {
            masterQueue.push(value);
            size++;
            return;
        }
        System.out.println("栈已经满了！！");
    }

    /**
     * 出栈
     *
     * @return 值
     */
    public T pop() {
        if (size > 0) {
            for (int i = 0 ; i < size - 1 ; i++)  {
                assistQueue.push(masterQueue.pop());
            }
            T data = masterQueue.pop();
            QueueArray<T> temp = masterQueue;
            masterQueue = assistQueue;
            assistQueue = temp;
            size--;
            return data;
        }
        return null;
    }

    public static void main(String[] args) {
        QueueConvertStack<Integer> stack = new QueueConvertStack<>();
        System.out.println(stack.pop());
        stack.push(0);
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
