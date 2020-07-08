package com.sqt;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-07-08 1:27
 * <p>
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
 * <p>
 * 我们这儿有一份航班预订表，表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着我们在从 i 到 j 的每个航班上预订了 k 个座位。
 * <p>
 * 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * 输出：[10,55,45,25,25]
 */
public class LeetCode_1109 {
    public static void main(String[] args) {
        int[][] arr = {{2, 2, 30}, {2, 2, 45}};
        corpFlightBookings2(arr, 2);
    }

    public static int[] corpFlightBookings2(
            int[][] bookings, int n) {

        int[] answer = new int[n];

        // 遍历整个bookings数组
        for (int[] b : bookings) {
            // 内层循环把每个航班预订数加上
            for (int i = b[0] - 1;
                 i <= b[1] - 1; i++) {
                answer[i] += b[2];
            }
        }
        return answer;
    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < bookings.length; i++) {
            for (int j = bookings[i][0]; j <= bookings[i][1]; j++) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + bookings[i][2]);
                } else {
                    map.put(j, bookings[i][2]);
                }
            }
        }
        int[] arr = new int[n];
        int index = 1;
        for (int key : map.keySet()) {
            arr[index] = map.get(key);
            index++;
        }
        return arr;
    }
}
