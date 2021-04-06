package com.sqt.huawei.day02;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-10-15 1:15
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2) {
                return i;
            }
        }
        return 0;
    }

    public static int reverse(int x) {
        int result = 0;
        String str = String.valueOf(x);
        boolean flag = false;
        if (str.contains("-")) {
            str = str.substring(1, str.length());
            flag = true;
        }
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i <= j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        str = new String(chars);
        if (str.startsWith("0")) {
            str = str.substring(1, str.length());
        }
        if (flag) {
            str = "-" + str;
        }
        try {
            result = Integer.parseInt(str);
        } catch (Exception e) {
        }
        return result;
    }

    public static int trailingZeroes(int n) {
        long res = 1;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        String str = String.valueOf(res);
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
