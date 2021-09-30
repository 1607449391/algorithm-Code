package com.xjq.eor;

/*
 *@author：徐家庆
 *@time：2021-09-20 13:15
 *@description：
 *             题目二：一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
 */
public class EorClass02 {

    /**
     * 解法：通过异或运算
     * @param arr 数组
     */
    public static void findNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
                result ^= arr[i];
        }
        System.out.println("result: "+ result);
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 2, 5, 2, 5, 2};
        findNumber(arr);
    }
}
