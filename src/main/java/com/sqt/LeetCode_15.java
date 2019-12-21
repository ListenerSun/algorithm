package com.sqt;

import java.util.*;

/**
 * @Description: 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-21 22:48
 */
public class LeetCode_15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3){
            return result;
        }
        int len = nums.length;
        //排序
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0){
                break;
            }
            //去重
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int R = len-1;
            int L = i+1;
            while(L < R){

                int sum = nums[i] + nums[R] + nums[L];
                if (sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i], nums[R], nums[L]);
                    result.add(temp);
                    //去重
                    while (L < R && nums[L] == nums[L+1]){
                        L++;
                    }
                    //去重
                    while(L < R && nums[R] == nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }else if(sum > 0){
                    R--;
                }else if(sum < 0){
                    L++;
                }
            }
        }
        return result;
    }
}
