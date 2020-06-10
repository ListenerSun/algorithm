package com.sqt.动态规划;

import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-10 1:05
 */
public class LeetCode_120 {

    // dp[i][j]: 就是到 第 i 行 第 j 列 最小的路径和
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row - 1).size();
        int[][] dp = new int[row][col];
        dp[0][0] = triangle.get(0).get(0);
        // 结果
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                // 最左边
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                }
                // 最右边
                else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {

                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
                }
            }
        }
        // 获取 第 i 行最小的路径和 即为结果
        for (int i = 0; i < col; i++) {
            res = Math.min(res, dp[row - 1][i]);
        }
        return res;
    }
}
