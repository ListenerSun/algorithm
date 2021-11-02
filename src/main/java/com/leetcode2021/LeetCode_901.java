package com.leetcode2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode_901 {

    List<Integer> list = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    public LeetCode_901() {
        list.clear();
        stack.clear();
        stack.push(-1);

    }

    public int next(int price) {
        int res = 1;
        list.add(price);

        while (stack.peek() != -1 && list.get(stack.peek()) <= price) {
            stack.pop();
        }
        res = list.size() - stack.peek() - 1;
        stack.push(list.size() - 1);
        return res;
    }

}
