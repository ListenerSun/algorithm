package com.sqt.递归;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-01 0:33
 */
public class LeetCode_22 {
    public static void main(String[] args) {
//        System.out.println(generateParenthesis(2));

        LeetCode_22 obj = new LeetCode_22();
        System.out.println(obj.backtrack2(2));
    }

    //  第一遍
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (open == max && close == max) {
            ans.add(cur);
            return;
        }
        if (open < max) {
            backtrack(ans, cur + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(ans, cur + ")", open, close + 1, max);
        }
    }

    /**
     * 第二遍
     */
    private List<String> res;

    public List<String> backtrack2(int n) {
        res = new ArrayList<>();
        backtrack2(res, 0, 0, n,"");
        return res;
    }

    public void backtrack2(List<String> res, int left, int right, int max, String cur) {
        // 递归终止条件: 左、右两边的括号都为 n 的时候
        if (left == max && right == max) {
            res.add(cur);
            return;
        }
        // 处理 该层 业务逻辑
        // 1:当 左括号个数 小于 总括号数/2 的时候,才可以添加左括号
        // 2:当 左括号个数 小于 总括号数/2 的时候,才可以添加左括号
        if (left < max) {
            backtrack2(res, left + 1, right, max, cur + "(");
        }
        // 1: 当右括号的个数 < 左括号的个数 才可以添加右括号
        if (right < left) {
            backtrack2(res, left, right+1, max, cur + ")");
        }

    }

}
