package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode sorted = head, unsorted = head.next;
        sorted.next = null;

        while (unsorted != null) {
            ListNode inserter = unsorted;
            unsorted = unsorted.next;

            inserter.next = null;
            sorted = insert(sorted, inserter);
        }

        return sorted;
    }

    private ListNode insert(ListNode sorted, ListNode inserter) {
        if (inserter.val < sorted.val) {
            inserter.next = sorted;
            return inserter;
        }
        else {
            ListNode p = sorted, q = null;
            while (p != null && p.val <= inserter.val) {
                q = p;
                p = p.next;
            }

            q.next = inserter;
            inserter.next = p;

            return sorted;
        }
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{-1,5,3,4,0});
        LinkedListUtil.printLinkedList(head);
        p147 sol = new p147();
        ListNode head1 = sol.insertionSortList(head);
        LinkedListUtil.printLinkedList(head1);
    }
}
