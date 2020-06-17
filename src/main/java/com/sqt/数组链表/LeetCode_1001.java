package com.sqt.数组链表;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-18 1:55
 * 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 * <p>
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class LeetCode_1001 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] B = {2, 5, 6};
        int n = 3;
        merge(A, m, B, n);
    }

    /** todo 优化
     * 双指针 从后往前排
     *
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >=0 && j >= 0) {
            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        // 剩下的数都比已经遍历过的数小
        // 如果 i 不为 0，则 A 没遍历完，都已经在 A 中不用再管
        // 如果 j 不为 0，则 B 没遍历完，直接全移到 A 中相同的位置
        while (j >= 0) {
            A[k--] = B[j--];
        }

    }
    /**
     * 双指针 从后往前排
     *
     * @param A
     * @param m
     * @param B
     * @param n
     */
    public static void merge1(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >=0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k] = A[i--];
            } else {
                A[k] = B[j--];
            }
            k--;
        }
        // 剩下的数都比已经遍历过的数小
        // 如果 i 不为 0，则 A 没遍历完，都已经在 A 中不用再管
        // 如果 j 不为 0，则 B 没遍历完，直接全移到 A 中相同的位置
        while (j >= 0) {
            A[k--] = B[j--];
        }

    }

}
