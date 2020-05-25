package com.sqt.回溯分治;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-25 10:37
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 通过次数90,101提交次数116,576
 */
public class LeetCode_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) {
            return ans;
        }
        dfs(ans, 0, new ArrayList<>(), nums);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int index, List<Integer> cur, int[] nums) {
        if (index == nums.length) {
            ans.add(cur);
            return;
        }
        cur.add(nums[index]);
        dfs(ans, index + 1, new ArrayList<>(cur), nums);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
