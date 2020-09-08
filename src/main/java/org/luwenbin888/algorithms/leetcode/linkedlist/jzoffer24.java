package org.luwenbin888.algorithms.leetcode.linkedlist;

public class jzoffer24 {
    public ListNode reverseList(ListNode head) {
        ListNode p = head, q = null, r = null;

        while (p != null) {
            r = p.next;
            p.next = q;
            q = p;
            p = r;
        }

        return q;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3,4,5});
        LinkedListUtil.printLinkedList(head);
        jzoffer24 sol = new jzoffer24();
        head = sol.reverseList(head);
        LinkedListUtil.printLinkedList(head);
    }
}
