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

//        LinkedList list = new LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        LinkedList cur = list;
//        cur.remove(0);
//        System.out.println(list);
//        System.out.println(cur);


        ListNode head = getListNode();
        ListNode listNode = swapPairs1(head);

    }

    private static ListNode getListNode(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        return listNode1;
    }

    /** 迭代
     * @param head
     * @return
     */
    public static ListNode swapPairs1(ListNode head) {
        // of the list and hence stores pointer to the head node.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevNode = dummy;
        while ((head != null) && (head.next != null)) {
            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;
            // Swapping
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            // Reinitializing the head and prevNode for next swap
            prevNode = firstNode;
            head = firstNode.next; // jump
        }

        // Return the new head node.
        return dummy.next;
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




    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

