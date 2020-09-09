package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        ListNode p = head, p1 = head.next;

        while (p1 != null) {
            ListNode p2 = p1.next;
            boolean dup = false;
            while (p2 != null && p1.val == p2.val) {
                dup = true;
                p2 = p2.next;
            }

            if (dup) {
                p.next = p2;
                p1 = p2;
            }
            else {
                p = p1;
                p1 = p2;
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,1,1,2,3});
        LinkedListUtil.printLinkedList(head);
        p82 sol = new p82();
        head = sol.deleteDuplicates(head);
        LinkedListUtil.printLinkedList(head);
    }
}
