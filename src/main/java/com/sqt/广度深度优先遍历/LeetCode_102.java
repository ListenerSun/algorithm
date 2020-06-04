package com.sqt.广度深度优先遍历;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-05 1:06
 * <p>
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
public class LeetCode_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> curList = new ArrayList<>();
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode node = queue.poll();
                curList.add(node.val);
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }
            }
            res.add(curList);
        }
        return res;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


