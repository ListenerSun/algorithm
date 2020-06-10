package com.sqt.数组链表;

import java.util.LinkedList;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-06-11 1:22
 * <p>
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class LeetCode_24 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        LinkedList cur = list;
        list.remove(0);
        System.out.println(list);
        System.out.println(cur);
    }

    /** 迭代
     * @param head
     * @return
     */
    public ListNode swapPairs1(ListNode head) {
        ListNode cur = new ListNode(0);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        cur = head;
        while (cur != null && cur.next != null) {

            ListNode first = head;
            ListNode second = head.next;
            first.next = second.next;
            second.next = first;
            dummy.next = second;
            cur = first.next;
        }
        return null;
    }

    /** 递归
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode secondNode = head.next;
        head.next = swapPairs(secondNode.next);
        secondNode.next = head;
        return secondNode;

    }




    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

