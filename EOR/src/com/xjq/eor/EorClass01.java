package com.xjq.eor;

/*
 *@author：徐家庆
 *@time：2021-09-20 12:24
 *@description：
 *          题目一：不使用临时变量交换a和b的值
 *
 */
public class EorClass01 {

    /**
     * 解法一：通过加法运算交换a和b
     * @param a 待交换数
     * @param b 待交换数
     */
    public static void swap01(int a, int b) {
        System.out.println("交换前：");
        System.out.printf("a = %d, b = %d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后：");
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    /**
     * 解法二：通过异或运算交换a和b
     * @param a 待交换数
     * @param b 待交换数
     */
    public static void swap02(int a, int b) {
        System.out.println("交换前：");
        System.out.printf("a = %d, b = %d\n", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("交换后：");
        System.out.printf("a = %d, b = %d\n", a, b);
    }


    public static void main(String[] args) {
        System.out.println("解法一：");
        swap01(10, 5);
        System.out.println("解法二：");
        swap02(10, 5);
    }
}
