package com.sqt;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-15 17:52
 *
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 *
 */
public class LeetCode_997 {

    public static void main(String[] args) {

    }

    /** 快排
     * @param A
     * @return
     */
    public int[] sortedSquares1(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    /**双指针
     * 1. 新建一个长度与原数组长度大小的数组
     * 2. 一个指针从前边遍历，一个指针从后边遍历
     * 3. 比较两个索引值平方的大小，然后从大到小的倒序插入到新的数组中去
     * @param A
     * @return
     */
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n-1, p = n-1;
        while ( j > i) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
            p++;
        }
        return result;
    }

}
