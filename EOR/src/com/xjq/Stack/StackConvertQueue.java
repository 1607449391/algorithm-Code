package com.xjq.Stack;

/*
 *@author：徐家庆
 *@time：2021-10-04 21:48
 *@description：
 *         栈实现队列的功能
 */
public class StackConvertQueue<T> {
    // 进栈
    private StackArray<T> inStack;

    // 出栈
    private StackArray<T> outStack;

    // 当前栈的存储量
    private int size;

    // 当前队列总容量
    private int coustomCapaCity;

    // 默认大小容量
    private static final int DEFAULT_CAPACITY = 5;

    public StackConvertQueue() {
        inStack = new StackArray<>(DEFAULT_CAPACITY);
        outStack = new StackArray<>(DEFAULT_CAPACITY);
        coustomCapaCity = DEFAULT_CAPACITY;
        size = 0;
    }

    public StackConvertQueue(int capacity) {
        inStack = new StackArray<>(capacity);
        outStack = new StackArray<>(capacity);
        coustomCapaCity = capacity;
        size = 0;
    }

    /**
     * 入队列
     *
     * @param value 值
     */
    public void push(T value) {
        if (size + 1 <=  coustomCapaCity) {
            inStack.push(value);
            size++;
            return;
        }
        System.out.println("队列已经满了~");
    }

    /**
     * 出队列
     *
     * @return 值
     */
    public T pop() {
        if (outStack.getSize() > 0) {
            size--;
            return outStack.pop();
        }else {
            if (inStack.getSize() > 0) {
                for (int i = 0 ; i <  size ; i++)  {
                    outStack.push(inStack.pop());
                }
                size--;
            }
            return outStack.pop();
        }
    }

    public static void main(String[] args) {
        StackConvertQueue<Integer> queue =  new StackConvertQueue<>(5);
        System.out.println(queue.pop());
        queue.push(0);
        queue.push(1);
        System.out.println(queue.pop());
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println("====================");
        int a = 1;
        int b = 5;
        int c = (a + b) >> 1;
        int d = a + ((b - a) >> 1);
        System.out.println(c);
        System.out.println(d);
        System.out.println(c == d);
    }
}
