package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.Stack;

public class p445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode p1 = l1, p2 = l2;
        while (p1 != null) {
            s1.push(p1.val);
            p1 = p1.next;
        }

        while (p2 != null) {
            s2.push(p2.val);
            p2 = p2.next;
        }

        int digit = 0, carry = 0;
        ListNode head = null;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            digit = s1.isEmpty()?0:s1.pop();
            digit += s2.isEmpty()?0:s2.pop();
            digit += carry;

            carry = digit / 10;
            digit = digit % 10;

            ListNode node = new ListNode(digit);
            node.next = head;
            head = node;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            node.next = head;
            head = node;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{7,2,4,3});
        LinkedListUtil.printLinkedList(l1);
        ListNode l2 = LinkedListUtil.construct(new int[]{5,6,4});
        LinkedListUtil.printLinkedList(l2);

        p445 sol = new p445();
        ListNode result = sol.addTwoNumbers(l1, l2);
        LinkedListUtil.printLinkedList(result);
    }
}
