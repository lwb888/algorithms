package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, q = head;
        while (p != null) {
            p = p.next;
            if (p != null) p = p.next;
            if (p == null) return false;

            q = q.next;
            if (p == q) return true;
        }

        return false;
    }
}
