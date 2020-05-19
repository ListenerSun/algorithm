package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-19 12:05
 *我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 *  
 *
 * 提示：
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A 是如上定义的山脉
 *  
 */
public class LeetCode_852 {

    /**线性查找
     * @param A
     * @return
     */
    public int peakIndexInMountainArray1(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) {
            i++;
        }
        return i;
    }

    /**二分查找
     * @param A
     * @return
     */
    public int peakIndexInMountainArray2(int[] A) {
        int i = 0;
        while (A[i] < A[i+1]) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Integer a = new Integer(400);
//        Integer b = new Integer(100);
        int c = 400;
        System.out.println(c == a);
    }
}
