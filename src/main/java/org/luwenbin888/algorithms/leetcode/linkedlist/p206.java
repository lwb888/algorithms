package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p206 {
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
        p206 sol = new p206();
        head = sol.reverseList(head);
        LinkedListUtil.printLinkedList(head);
    }
}
