package com.sqt;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-09 7:10 PM
 */
public class LeetCode_84 {

    public static void main(String[] args) {

    }

    public int largestRectangleArea(int[] heights) {

        int max_area = 0;
        for (int i = 0; i < heights.length; i++) {
            int min_height = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                min_height = Integer.min(min_height, heights[j]);
                int area = (j - i + 1) * min_height;
                max_area = Integer.max(area, max_area);
            }

        }
        return max_area;

    }
}
