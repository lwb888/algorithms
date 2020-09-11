package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode head = new ListNode(0), p = head;
        int digit = 0, carry = 0;
        while (l1 != null || l2 != null) {
            digit = l1 != null ? l1.val : 0;
            digit += l2 != null ? l2.val : 0;
            digit += carry;

            carry = digit / 10;
            digit = digit % 10;
            p.next = new ListNode(digit);
            p = p.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            p.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{2,4,3});
        ListNode l2 = LinkedListUtil.construct(new int[]{5,6,4});

        ListNode head = new p2().addTwoNumbers(l1, l2);
        LinkedListUtil.printLinkedList(head);
    }
}
