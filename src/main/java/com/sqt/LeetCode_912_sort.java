package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-15 18:42
 *
 * 给你一个整数数组 nums，请你将该数组升序排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [5,2,3,1]
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：nums = [5,1,1,2,0,0]
 * 输出：[0,0,1,1,2,5]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 50000
 * -50000 <= nums[i] <= 50000
 *
 */
public class LeetCode_912_sort {

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        sortArray(nums);
    }

    /**插入排序
     * 1. i 左边的数据全是排好序的
     * @param nums
     * @return
     */
    public static int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length ; i++) {
            int value = nums[i];
            int j = i -1;
            while (j >= 0) {
                // 只有j索引的数据大于value时,才需要往前移动数据
                if (nums[j] > value) {
                    nums[j+1] = nums[j--];
                } else {
                    // 防止leetcode超时
                    break;
                }
            }
            // 把value插入到 j索引 位置上,但是此时注意j索引有可能是 -1
            nums[j+1] = value;
        }
        return nums;
    }
}
