package com.xjq.Stack;

/*
 *@author：徐家庆
 *@time：2021-10-04 20:48
 *@description：
 *          栈---数组实现
 */
public class StackArray<T> {
    // 栈
    private Object[] data;

    // 栈的大小
    private int size;

    // 栈尾指针
    private int tail;

    // 默认容量大小
    private static final int DEFAULT_CAPACITY = 5;

    public StackArray() {
        size = 0;
        data = new Object[DEFAULT_CAPACITY];
        tail = -1;
    }

    public StackArray(int capacity) {
        size = 0;
        data = new Object[capacity];
        tail = -1;
    }

    private int getNextSize(int flag) {
        return flag + 1 < data.length ? ++flag : (flag + 1) % data.length;
    }

    /**
     * 入栈
     *
     * @param value 值
     */
     public void push(T value) {
        if (size + 1 <= data.length) {
            tail = getNextSize(tail);
            data[tail] =  value;
            size++;
            return;
        }
        System.out.println("栈已经满了！");
     }

    /**
     * 出栈
     *
     * @return 值
     */
    public T pop() {
         if (size > 0) {
             size--;
             return (T)data[tail--];
         }
         return null;
     }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<>(5);
        System.out.println(stack.pop());
        stack.push(0);
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
