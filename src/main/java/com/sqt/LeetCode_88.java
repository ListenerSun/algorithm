package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-09 10:17
 * <p>
 * <p>
 * <p>
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 *  
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *  
 * <p>
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 */
public class LeetCode_88 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] nums2 = {2, 5, 6};
        merge2(nums1,m,nums2,n);

    }

    /** 方法 一
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);
        int i = 0, j = 0, p = 0;
        while (i < m && j < n) {
            nums1[p++] = nums1Copy[i] < nums2[j] ? nums1Copy[i++] : nums2[j++];
        }
        if (i == m) {
            System.arraycopy(nums2, j, nums1, p, m + n - p);
        } else {
            System.arraycopy(nums1Copy, i, nums1, p, m + n - p);
        }
        return nums1;
    }

    /**方法 二 双指针
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n -1, i = m - 1, j = n - 1;
        while ( i >= 0 && j >=0) {
            nums1[p--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
       while ( j >= 0) {
           nums1[p--] = nums2[j--];
       }
        return nums1;
    }
}
