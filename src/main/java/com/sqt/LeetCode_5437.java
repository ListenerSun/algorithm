package com.sqt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-14 19:20
 * <p>
 * 给你一个整数数组 arr 和一个整数 k 。现需要从数组中恰好移除 k 个元素，请找出移除后数组中不同整数的最少数目。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [5,5,4], k = 1
 * 输出：1
 * 解释：移除 1 个 4 ，数组中只剩下 5 一种整数。
 * 示例 2：
 * <p>
 * 输入：arr = [4,3,1,1,3,3,2], k = 3
 * 输出：2
 * 解释：先移除 4、2 ，然后再移除两个 1 中的任意 1 个或者三个 3 中的任意 1 个，最后剩下 1 和 3 两种整数。
 */
public class LeetCode_5437 {

    public static void main(String[] args) {
        int[] arr = {28,24,13,35,36,3,18,40,33,29};
        int k = 6;
        findLeastNumOfUniqueInts(arr,k);
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        if (arr.length == 0 || k >= arr.length) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] res = new int[map.size()];
        int index = 0;
        for (int key : map.keySet()) {
            res[index++] = map.get(key);
        }
        Arrays.sort(res);
        int size = res.length;
        for(int i = 0; i < res.length; i ++){
            if(k >= res[i]){
                k -= res[i];
                size--;
            }else{
                break;
            }
        }
        return size;

    }

}
