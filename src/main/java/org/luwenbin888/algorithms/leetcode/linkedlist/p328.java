package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = new ListNode(0), podd = odd;
        ListNode even = new ListNode(0), peven = even;

        int current = 1;
        ListNode p = head, next;
        while (p != null) {
            next = p.next;
            p.next = null;
            if (current++ % 2 == 0) {
                peven.next = p;
                peven = peven.next;
            }
            else {
                podd.next = p;
                podd = podd.next;
            }
            p = next;
        }

        podd.next = even.next;

        return odd.next;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{2,1,3,5,6,4,7});
        LinkedListUtil.printLinkedList(head);

        p328 sol = new p328();
        ListNode head1 = sol.oddEvenList(head);
        LinkedListUtil.printLinkedList(head1);
    }
}
