package org.luwenbin888.algorithms.leetcode.linkedlist;

public class Problem203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = head, q = null;
        while (p != null) {
            if (p.val == val) {
                if (p == head)  { head = head.next; p.next = null; p = head; }
                else {
                    q.next = p.next;
                    p = q.next;
                }
            }
            else {
                q = p;
                p = p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,1,6,3,4,5,6,9,9});
        Problem203 sol = new Problem203();
        ListNode head1 = sol.removeElements(head, 9);
        LinkedListUtil.printLinkedList(head1);
    }
}
