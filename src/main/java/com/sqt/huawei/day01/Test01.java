package com.sqt.huawei.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-10-14 0:21
 */
public class Test01 {

    public static void main(String[] args) {
        int a = titleToNumber("ZY");
        System.out.println(a);
    }

    /**
     * @param s
     * @return
     */
    public static int titleToNumber(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        char[] res = new char[chars.length];
        int b = length;
        for (int index = 0; index < length; index++) {
            res[--b] = chars[index];
        }
        int num = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (i == 0) {
                num += res[i] - 64;
            } else {
                num += (res[i] - 'A' + 1) * Math.pow(26,i);
            }
        }
        return num;
    }
}
