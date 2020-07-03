package com.sqt.动态规划;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-04 0:10
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * <p>
 * 输出: 4
 */
public class LeetCode_221 {

    /**
     * 动态规划
     *
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        int maxLength = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxLength;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    maxLength = Math.max(maxLength, dp[i][j]);
                }

            }
        }
        return maxLength * maxLength;
    }
}
