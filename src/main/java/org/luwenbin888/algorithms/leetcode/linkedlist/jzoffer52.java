package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class jzoffer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode p = headA, q = headB;
        ListNode result = null;
        while (p != null && q != null) {
            if (nodes.contains(p)) { return p; }
            nodes.add(p);
            if (nodes.contains(q)) { return q; }
            nodes.add(q);

            p = p.next;
            q = q.next;
        }

        if (p != null) result = p;
        if (q != null) result = q;

        while (result != null) {
            if (nodes.contains(result)) return result;
            result = result.next;
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            if (p != null) p = p.next; else p = headB;
            if (q != null) q = q.next; else q = headA;
        }

        return p;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{2,6,4});
        ListNode l2 = LinkedListUtil.construct(new int[]{1,5});

        jzoffer52 sol = new jzoffer52();
        ListNode node = sol.getIntersectionNode(l1, l2);
        if (node != null) System.out.println(node.val);
        else System.out.println("no intersection");
    }
}
