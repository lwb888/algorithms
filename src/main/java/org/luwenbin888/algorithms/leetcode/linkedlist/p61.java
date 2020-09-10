package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;

        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }

        if (len == 1) return head;

        int rotateCnt = k % len;

        if (rotateCnt == 0) return head;

        ListNode q = head;
        p = head;

        while (rotateCnt-- > 0) {
            p = p.next;
        }

        while (p.next != null) {
            p = p.next;
            q = q.next;
        }

        ListNode r = q.next;
        q.next = null;
        p.next = head;
        head = r;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{0,1,2});
        LinkedListUtil.printLinkedList(head);
        p61 sol = new p61();
        ListNode head1 = sol.rotateRight(head, 4);
        LinkedListUtil.printLinkedList(head1);
    }
}
