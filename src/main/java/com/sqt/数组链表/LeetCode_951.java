package com.sqt.数组链表;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-27 1:01
 * 给定一个数组 A，将其划分为两个不相交（没有公共元素）的连续子数组 left 和 right， 使得：
 * <p>
 * left 中的每个元素都小于或等于 right 中的每个元素。
 * left 和 right 都是非空的。
 * left 要尽可能小。
 * 在完成这样的分组后返回 left 的长度。可以保证存在这样的划分方法。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[5,0,3,8,6]
 * 输出：3
 * 解释：left = [5,0,3]，right = [8,6]
 * 示例 2：
 * <p>
 * 输入：[1,1,1,0,6,12]
 * 输出：4
 * 解释：left = [1,1,1,0]，right = [6,12]
 *  
 */
public class LeetCode_951 {

    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 8, 6};
        partitionDisjoint(arr);
    }

    public static int partitionDisjoint(int[] A) {
        int[] maxLeft = new int[A.length];
        int[] minRight = new int[A.length];
        int m = A[0];
        for (int i = 0; i < A.length; i++) {
            m = Math.max(m, A[i]);
            maxLeft[i] = m;
        }
        m = A[A.length - 1];
        for (int i = A.length - 1; i >= 0; i--) {
            m = Math.min(m, A[i]);
            minRight[i] = m;
        }
        for (int i = 1; i < A.length; i++) {
            if (maxLeft[i - 1] < minRight[i]) {
                return i;
            }
        }
        throw new IllegalArgumentException("no");
    }

    public static int partitionDisjoint2(int[] A) {
        int max = A[0];
        int partitionIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < A[i]) {
                max = Math.max(max, A[i]);
                partitionIndex = i + 1;
            } else {
                max = Math.max(max, A[i]);
            }
        }
        return partitionIndex;
    }

}
