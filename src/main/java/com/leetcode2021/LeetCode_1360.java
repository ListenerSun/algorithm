package com.leetcode2021;

import java.util.Arrays;

public class LeetCode_1360 {
    // date1 = "2019-06-29", date2 = "2019-06-30"

    public static void main(String[] args) {
        String date1 = "1971-06-29";
        String date2 = "2010-09-23";
        // new LeetCode_1360().daysBetweenDates(date1, date2);
        // int[] arr = { 1, 2 };
        // arr[0]++;
        System.out.println(new LeetCode_1360().daysBetweenDates(date1, date2));
    }

    public int daysBetweenDates(String date1, String date2) {
        int res = 0;
        if (date1.compareTo(date2) > 0) {
            String temp = date1;
            date1 = date2;
            date2 = temp;
        }
        int[] arr1 = Arrays.stream(date1.split("-")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr2 = Arrays.stream(date2.split("-")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] mouth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        mouth[2] = isRongNian(arr1[0]) ? 29 : 28;
        while (arr1[0] < arr2[0] || (arr1[0] == arr2[0] && arr1[1] < arr2[1])
                || (arr1[0] == arr2[0] && arr1[1] == arr2[1] && arr1[2] < arr2[2])) {
            if (arr1[2] == mouth[arr1[1]]) {
                arr1[1]++;
                arr1[2] = 0;
            }
            if (arr1[1] == 13) {
                arr1[0]++;
                arr1[1] = 1;
                mouth[2] = isRongNian(arr1[0]) ? 29 : 28;
            }
            arr1[2]++;
            res++;

        }
        return res;
    }

    public static boolean isRongNian(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }

    public int daysBetweenDates2(String date1, String date2) {
        int res = 0;
        if (date1.compareTo(date2) > 0) {
            String temp = date1;
            date1 = date2;
            date2 = temp;
        }
        int[] arr1 = Arrays.stream(date1.split("-")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr2 = Arrays.stream(date2.split("-")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] mouth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int startYear = arr1[0], startMonth = arr1[1], day = arr1[2];
        while (startYear < arr2[0] || (startYear == arr2[1] && startMonth < arr2[1])
                || (startYear == arr2[0] && startMonth == arr2[1] && day < arr2[2])) {
            if (day == 28 && startMonth == 2) {
                if (!(startYear % 4 == 0)) {
                    startMonth++;
                    day = 0;
                }
            }
            if (day == 29 && startMonth == 2) {
                startMonth++;
                day = 0;
            }
            if (day == mouth[startMonth] && startMonth != 2) {
                startMonth++;
                day = 0;
            }
            if (startMonth == 13) {
                startYear++;
                startMonth = 1;
            }
            day++;
            res++;
        }
        return res;
    }

}
