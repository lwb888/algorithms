package org.luwenbin888.algorithms.leetcode.linkedlist;

public class jzoffer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head, q = null;
        while (p != null && p.val != val) {
            q = p;
            p = p.next;
        }

        if (p == null) return head;
        if (p == head) { head = head.next; return head; }
        else {
            q.next = p.next;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{4,5,1,9});
        jzoffer18 sol = new jzoffer18();
        ListNode newhead = sol.deleteNode(l1, 9);
        LinkedListUtil.printLinkedList(newhead);
    }
}
