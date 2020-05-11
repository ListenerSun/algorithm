package com.sqt;

import java.util.Arrays;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-08 20:24
 */
public class Test {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 9, 9, 9, 9, 15};
        int[] arr2 = new int[]{2, 4, 5, 8, 10, 13, 14};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int y = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[y] = arr1[i];
                i++;
            } else {
                arr3[y] = arr2[j];
                j++;
            }
            y++;
        }
        if (i == arr1.length) {
            while (j < arr2.length) {
                arr3[y++] = arr2[j++];
            }
        } else {
            while (i < arr1.length) {
                arr3[y++] = arr1[i++];
            }
        }
        return arr3;
    }

}
