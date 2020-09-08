package org.luwenbin888.algorithms.leetcode.linkedlist;

public class jzoffer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head, q = head;
        int gap = 1;
        while (gap++ < k) p = p.next;

        while (p.next != null) {
            q = q.next;
            p = p.next;
        }

        return q;
    }

    public static void main(String[] args) {
        jzoffer22 sol = new jzoffer22();
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3,4,5});
        ListNode node = sol.getKthFromEnd(head, 5);
        if (node != null) System.out.println(node.val);
    }
}
