package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode p1 = dummy, p2 = dummy;
        while (p1 != null && p1.next != null) {
            p1 = p1.next;
            if (p1 != null) p1 = p1.next;

            p2 = p2.next;
        }

        ListNode second = p2.next;
        p2.next = null;
        second = reverse(second);

        p1 = head;
        p2 = second;

        dummy.next = null;
        ListNode p = dummy;
        while (p1 != null || p2 != null) {
            p.next = p1;
            p1 = p1.next;
            p = p.next;
            if (p2 != null) {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }
        }
    }

    private static ListNode reverse(ListNode head) {
        ListNode p = head, q = null;
        while (p != null) {
            ListNode next = p.next;
            p.next = q;
            q = p;
            p = next;
        }

        return q;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2});
        LinkedListUtil.printLinkedList(head);
        p143 sol = new p143();
        sol.reorderList(head);
        LinkedListUtil.printLinkedList(head);
    }
}
