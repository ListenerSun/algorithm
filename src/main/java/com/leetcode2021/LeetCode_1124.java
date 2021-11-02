// package com.leetcode2021;

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Stack;

// public class LeetCode_1124 {

// public static void main(String[] args) {
// Map<Integer> map = new HashMap<>();
// map.getOrDefault(key, defaultValue)

// int[] arr = { 6, 6, 6 };
// new LeetCode_1124().longestWPI(arr);
// }

// public int longestWPI(int[] hours) {

// int presum[] = new int[hours.length + 1];
// presum[0] = 0;
// for (int i = 1; i < presum.length; i++) {
// presum[i] = presum[i - 1] + (hours[i - 1] > 8 ? 1 : -1);
// }
// Stack<Integer> stack = new Stack<>();
// for (int i = 0; i < presum.length; i++) {
// if (stack.isEmpty() || presum[stack.peek()] > presum[i]) {
// stack.push(i);
// }
// }
// int res = 0;
// for (int i = presum.length - 1; i >= 0; i--) {
// while (!stack.isEmpty() && 0 < presum[i] - presum[stack.peek()]) {
// res = Math.max(res, i - stack.pop());
// }
// }
// return res;
// }

// }
