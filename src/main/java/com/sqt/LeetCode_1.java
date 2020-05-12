package com.sqt;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 两数之和 哈希表 算法
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-12 18:32
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 */
public class LeetCode_1 {

    public static void main(String[] args) {

    }

    public static  int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for ( int i = 0; i< nums.length; i++) {
            int num2 = target - nums[i];
            if (map.containsKey(num2)) {
                result[0] = i;
                result[1] = map.get(num2);
            }
         map.put(nums[i],i);
        }
        return result;
    }
}
