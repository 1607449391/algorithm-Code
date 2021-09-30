package com.xjq.eor;

/*
 *@author：徐家庆
 *@time：2021-09-20 13:52
 *@description：
     *          题目四：一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数
 */
public class EorClass04 {

    /**
     * 异或运算
     * @param arr 数组
     */
    public static void findNumberTwo(int[] arr) {
        int EOrResult =  0;
        for (int item : arr) {
            // 获取数组异或的结果
            EOrResult ^= item;
        }
        // 求出最低位为1的位置
        int flag = EOrResult & -EOrResult;
        int result = 0;
        // 按照flag进行分组，并且选取一组进行异或运算
        for (int item : arr) {
            if ((item & flag) == 0) {
                result ^= item;
            }
        }
        System.out.println("result a =  " +  result);
        System.out.println("result b =  " + (EOrResult ^ result));
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 2, 2, 2, 5};
        findNumberTwo(arr);
    }
}
