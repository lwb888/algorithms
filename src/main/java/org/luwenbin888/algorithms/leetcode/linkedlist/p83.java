package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode q = head, p = head.next;
        while (p != null) {
            while (p != null && p.val == q.val) {
                p = p.next;
            }
            if (p == null) {
                q.next = null;
                break;
            }
            else {
                q.next = p;
                q = p;
                p = p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        p83 sol = new p83();
        ListNode head = LinkedListUtil.construct(new int[]{1,1,1,2,2,2,2,3,5,5,6});
        LinkedListUtil.printLinkedList(head);
        head = sol.deleteDuplicates(head);
        LinkedListUtil.printLinkedList(head);
    }
}
