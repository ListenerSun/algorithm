package com.sqt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-17 23:18
 *
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,3,2]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode_94 {

    /**递归 算法
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        // 深度遍历
        helperDepth(root,result);
        // 广度遍历
        helperLevel(root,result);
        return result;

    }

    /** 广度优先遍历
     * @param root
     * @param result
     */
    private void helperLevel(TreeNode root, List<Integer> result) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            // 先把所有的左节点 放进去
            if (null != root) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }

    }

    /**
     * 深度遍历
     * @param root
     * @param result
     */
    private void helperDepth(TreeNode root, List<Integer> result) {
        if (root == null) {
            return ;
        }
        if (root.left != null) {
            helperDepth(root.left,result);
        }
        result.add(root.val);
        if (root.right != null) {
            helperDepth(root.right,result);
        }

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
