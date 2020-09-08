package org.luwenbin888.algorithms.leetcode.linkedlist;

public class LinkedListUtil {
    public static void printLinkedList(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + "-->");
            p = p.next;
        }
    }

    public static ListNode construct(int[] data) {
        ListNode head = null, p = null;
        for (int elem: data) {
            ListNode node = new ListNode(elem);
            if (head == null) head = p = node;
            else {
                p.next = node;
                p = node;
            }
        }

        return head;
    }
}
