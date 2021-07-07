package com.leetcode2021;

import java.util.PriorityQueue;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-07-02 1:15
 */
public class LeetCode_703 {

    class KthLargest {

        PriorityQueue<Integer> p;
        int k;

        public KthLargest(int k, int[] nums) {
            p = new PriorityQueue(k);
            this.k = k;
            for (int num : nums) {
                add(num);
            }

        }

        public int add(int val) {
            if (p.size() < k) {
                p.add(val);
            } else {
                int peek = p.peek();
                if (peek < val) {
                    p.poll();
                    p.add(val);
                }
            }
            return p.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}
