package com.leetcode2021;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-07-09 2:09
 */
public class LeetCode_239 {

    public static void main(String[] args) {
        System.out.println("111");

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] res = new int[nums.length - k + 1];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>((w1, w2) -> w2 - w1);
        for (int i = 0, index = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (i < k - 1) {
                p.add(nums[i]);
                continue;
            }
            p.add(nums[i]);
            res[index] = p.peek();
            if (i - k >= map.get(nums[i])) {
                p.poll();
            }
            index++;
        }
        return res;
    }
}
