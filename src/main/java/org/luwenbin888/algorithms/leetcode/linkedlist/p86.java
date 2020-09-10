package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode head1 = new ListNode(0), p1 = head1;
        ListNode head2 = new ListNode(0), p2 = head2;

        ListNode p = head, q = null;
        while (p != null) {
            q = p.next;
            p.next = null;
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            }
            else {
                p2.next = p;
                p2 = p2.next;
            }
            p = q;
        }

        p1.next = head2.next;
        return head1.next;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,4,3,2,5,2});
        LinkedListUtil.printLinkedList(head);
        p86 sol = new p86();
        ListNode head2 = sol.partition(head, 3);
        LinkedListUtil.printLinkedList(head2);
    }
}
