package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) return head;

        ListNode before, after;
        ListNode p = head;
        int k = n - m + 1;
        int m1 = m;
        while (--m1 > 1) {
            p = p.next;
        }

        if (m == 1) {
            before = null;

        }
        else {
            before = p;
            p = before.next;
            before.next = null;
        }

        ListNode q = null;

        ListNode next;
        ListNode tail = p;
        while (k-- > 0) {
            next = p.next;
            p.next = q;
            q = p;
            p = next;
        }

        after = p;
        if (m > 1) {
            before.next = q;
        }
        tail.next = after;

        if (m > 1) return head;
        else return q;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3,4,5});
        LinkedListUtil.printLinkedList(head);
        p92 sol = new p92();
        ListNode head2 = sol.reverseBetween(head, 2, 4);
        LinkedListUtil.printLinkedList(head2);
    }
}
