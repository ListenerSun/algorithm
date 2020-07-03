package com.sqt.数组链表;

import java.util.HashMap;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-03 2:04
 * <p>
 * <p>
 * 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 示例 2:
 * <p>
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 */
public class LeetCode_56 {

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
//        merge(arr);

        HashMap<String,Object> map = new HashMap<>(8);
    }

    public static int[][] merge(int[][] intervals) {
        int[][] res = new int[intervals.length][2];
        for (int i = 0; i < intervals.length - 1; i++) {
            int j = i + 1;
            if (intervals[i][1] < intervals[j][0]) {

            } else if (intervals[i][1] > intervals[j][0] && intervals[i][1] < intervals[j][1]) {
                i++;
                intervals[i][1] = intervals[j][1];
                res[i] = intervals[i];
            } else {
                i++;
            }
            res[i] = intervals[i];
        }
        return res;
    }
}
