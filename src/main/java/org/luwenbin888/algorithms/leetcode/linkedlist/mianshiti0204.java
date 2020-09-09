package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0204 {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0), gte = new ListNode(0);
        ListNode p1 = less, p2 = gte;

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

        p1.next = gte.next;
        return less.next;
    }

    public static void main(String[] args) {
        mianshiti0204 sol = new mianshiti0204();
        ListNode head = LinkedListUtil.construct(new int[]{3,5,8,5,10,2,1});
        LinkedListUtil.printLinkedList(head);
        ListNode head1 = sol.partition(head, 5);
        LinkedListUtil.printLinkedList(head1);
    }
}
