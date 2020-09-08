package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p876 {
    public ListNode middleNode(ListNode head) {
        ListNode p = head, q = head;
        while (p.next != null) {
            p = p.next;
            if (p.next != null) p = p.next;

            q = q.next;
        }

        return q;
    }
}
