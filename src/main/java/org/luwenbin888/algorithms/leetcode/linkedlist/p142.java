package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class p142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        Set<ListNode> visited = new HashSet<>();

        ListNode p = head;
        while (p != null) {
            if (visited.contains(p)) return p;
            visited.add(p);
            p = p.next;
        }

        return null;
    }
}
