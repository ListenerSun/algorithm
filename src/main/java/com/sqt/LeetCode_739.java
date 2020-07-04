package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-05 1:13
 *
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 *
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 *
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 *
 */
public class LeetCode_739 {

    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        for (int i = 0; i < T.length - 1; i++) {
            int j = i + 1;
            while (j < T.length) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                } else {
                    res[i] = 0;
                }
                j++;
            }
        }
        return res;
    }
}
