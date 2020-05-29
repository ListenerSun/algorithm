package com.sqt.回溯分治;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-25 9:31
 * <p>
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2.00000, 10
 * 输出: 1024.00000
 * 示例 2:
 * <p>
 * 输入: 2.10000, 3
 * 输出: 9.26100
 * 示例 3:
 * <p>
 * 输入: 2.00000, -2
 * 输出: 0.25000
 * 解释: 2-2 = 1/22 = 1/4 = 0.25
 * 说明:
 * <p>
 * -100.0 < x < 100.0
 * n 是 32 位有符号整数，其数值范围是 [−231, 231 − 1] 。
 * 通过次数94,962提交次数265,069
 */
public class LeetCode_50 {

    public static void main(String[] args) {
//        System.out.println(myPow1(-13.62608,3));
    }

    /**
     * v暴力法
     *
     * @param x
     * @param n
     * @return
     */
    public static double myPow1(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double res = 1.0;
        for (int i = 1; i <= n; i++) {
            res = res * x;
        }
        return res;
    }

    /**
     * @param x
     * @param n
     * @return
     */
    public double myPow2(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return down(x,n);
    }
    public double down(double x, int n) {
        // 递归终止条件
        if (n == 0) {
            return 1.0;
        }
        // 调用递归
        double temp = down(x, n / 2);
        // 合并结果
        return n%2 == 0 ? temp*temp : temp*temp*x;
    }

}
