package com.leetcode2021;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2021-03-29 1:20
 */
public class LeetCode_859 {


    public static boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int length = a.length();
        int count = 0;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
                if (count == 1) {
                    index1 = i;
                } else if (count == 2) {
                    index2 = i;
                } else {
                    return false;
                }
            }
        }
        if (count == 0) {
            for (int i = 0; i < length - 1; i++) {
                if (a.indexOf(a.charAt(i), i + 1) != -1) {
                    return true;
                }
            }
        }
        return count == 2 && (a.charAt(index1) == b.charAt(index2) && a.charAt(index2) == b.charAt(index1));
    }

    public static void main(String[] args) {
        String a = "ab";
        String b = "ab";
        buddyStrings(a,b);

    }

}


