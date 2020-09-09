package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0205 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, digit = 0;
        ListNode p1 = l1, p2 = l2;
        ListNode head = new ListNode(0), p = head;
        while (p1 != null || p2 != null) {
            digit += p1 != null? p1.val : 0;
            digit += p2 != null? p2.val : 0;
            digit += carry;
            carry = digit / 10;
            digit = digit % 10;

            p.next = new ListNode(digit);
            p = p.next;
            digit = 0;

            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry == 1) {
            p.next = new ListNode(carry);
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode p1 = LinkedListUtil.construct(new int[]{2,4,3});
        LinkedListUtil.printLinkedList(p1);
        ListNode p2 = LinkedListUtil.construct(new int[]{5,6,4});
        LinkedListUtil.printLinkedList(p2);

        mianshiti0205 sol = new mianshiti0205();
        ListNode head = sol.addTwoNumbers(p1, p2);
        LinkedListUtil.printLinkedList(head);
    }
}
