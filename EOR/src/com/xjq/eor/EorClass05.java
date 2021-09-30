package com.xjq.eor;

/*
 *@author：徐家庆
 *@time：2021-09-20 14:34
 *@description：
 *          题目五：一个数组中有一种数出现K次，其他数都出现了M次，其中M  > 1且K < M。找到出现了K次的数
 *          要求，额外空间复杂度O(1),时间复杂度为O(N)
 */
public class EorClass05 {

    /**
     * 异或运算
     *
     * @param arr 数组
     * @param k k次
     * @param m m次
     */
    public static void findNumberByK(int[] arr, int k, int m) {
        int bitMap[] = new int[32];
        int result = 0;
        // 存储数组中每个数的每一位的出现1的次数
        for (int item : arr) {
            for (int i = 0; i < 32; i++) {
                // 获取每个数的每一位的值
                bitMap[i] += (item >> i) & 1;
            }
        }
        // 根据统计结果构建结果
        for (int j = 0; j < 32; j++) {
            if (bitMap[j] % m != 0) {
                result |= 1 << j;
            }
        }
        System.out.println("result: " + result);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,5,5,5,3};
        findNumberByK(arr, 2, 4);
    }
}
