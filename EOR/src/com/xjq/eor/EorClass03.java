package com.xjq.eor;

/*
 *@author：徐家庆
 *@time：2021-09-20 13:34
 *@description：
 *              题目三：怎么把int类型的数，提取出最右侧的1来
 */
public class EorClass03 {

    /**
     * 解法：异或运算
     * @param target
     */
    public static void getIntegerRightOne(int target) {
        int result = target & (-target);
        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        getIntegerRightOne(10);
    }
}
