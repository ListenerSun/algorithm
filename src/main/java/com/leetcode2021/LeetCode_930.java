package com.leetcode2021;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-07-08 1:08
 */
public class LeetCode_930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += nums[i];
            res += map.getOrDefault(sum - goal, 0);
        }
        return res;
    }

    public int numSubarraysWithSum1(int[] nums, int goal) {
        int res = 0;
        int sum = 0;
        int right = 0, left1 = 0, left2 = 0;
        while (right < nums.length) {
            while (left2 < right && left1 < left2) {
                sum += nums[left1];
                if (sum == goal) {
                    res++;
                }
                if (sum > goal) {
                    left2++;
                    sum = 0;
                }
                left1++;
            }
            right++;
        }
        return res;
    }
}
