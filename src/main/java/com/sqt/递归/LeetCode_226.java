package com.sqt.递归;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-22 18:11
 */
public class LeetCode_226 {


    public TreeNode invertTree(TreeNode root) {
        // 终止条件
        if (null == root) {
            return root;
        }
        // 该层业务逻辑
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        // 递归调用
        invertTree(root.left);
        invertTree(root.right);
        // 返回
        return root;
    }


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
