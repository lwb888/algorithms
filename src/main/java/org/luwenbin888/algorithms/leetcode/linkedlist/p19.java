package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode p = head, q = head;
        int i = n;
        while (i-- > 0 && p != null) {
            p = p.next;
        }

        if (p == null) return head.next;

        while (p.next != null) {
            p = p.next;
            q = q.next;
        }

        q.next = q.next.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3,4,5});
        LinkedListUtil.printLinkedList(head);
        p19 sol = new p19();
        ListNode head1 = sol.removeNthFromEnd(head, 5);
        LinkedListUtil.printLinkedList(head1);
    }
}
