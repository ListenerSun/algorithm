package com.sqt;

/**
 * x2 + xy - y2 +z
 *
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-27 22:16
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2};
        getMax(arr);
    }

    private static String getResult(String line) {
        Integer v;
        if (line.contains("+")) {
            String[] split = line.split("\\+");
            v = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            return String.valueOf(v);
        } else if (line.contains("/")) {
            String[] split  = line.split("/");
            v = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            return String.valueOf(v);
        } else if (line.contains("*")) {
            String[] split = line.split("\\*");
            v = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
            return String.valueOf(v);
        } else if (line.contains("-")) {
            String[] split = line.split("-");
            if (line.startsWith("-")) {
                v = -Integer.parseInt(split[1]) - Integer.parseInt(split[2]);
                return String.valueOf(v);
            } else {
                v = Integer.parseInt(split[0]) - Integer.parseInt(split[1]);
                return String.valueOf(v);
            }
        }
        return null;
    }


    private static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j] - arr[i];
                    max = Integer.max(max,temp);
                }
            }
        }
        return max;
    }

}
