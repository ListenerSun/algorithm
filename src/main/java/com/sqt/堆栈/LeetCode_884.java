package com.sqt.堆栈;

import java.util.Stack;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-31 1:54
 */
public class LeetCode_884 {

    public boolean backspaceCompare(String S, String T) {
        return buildString(S).equals(buildString(T));
    }

    private String buildString(String S) {
        Stack stack_t = new Stack();
        for (int i = 0; i < S.toCharArray().length; i++) {
            if (S.charAt(i) == '#') {
                if (!stack_t.isEmpty()) {
                    stack_t.pop();
                }
            } else {
                stack_t.push(S.charAt(i));
            }
        }
        return String.valueOf(stack_t);
    }

    public static void main(String[] args) {
        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}
