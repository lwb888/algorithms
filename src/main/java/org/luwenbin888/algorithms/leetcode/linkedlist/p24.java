package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        ListNode prev = head;
        while (prev != null && prev.next != null && prev.next.next != null) {
            ListNode nextPrev = prev.next.next.next;
            ListNode p = prev.next, q = prev.next.next;
            prev.next = q; q.next = p;
            p.next = nextPrev;

            prev = prev.next.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3,4});
        LinkedListUtil.printLinkedList(head);
        p24 sol = new p24();
        head = sol.swapPairs(head);
        LinkedListUtil.printLinkedList(head);
    }
}
