package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0208 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode tortise = head, hare = head;
        while (hare != null) {
            hare = hare.next;
            if (hare != null) hare = hare.next;

            tortise = tortise.next;
            if (tortise == hare) break;
        }

        if (hare == null) return null;

        tortise = head;
        while (hare != tortise) {
            hare = hare.next;
            tortise = tortise.next;
        }

        return hare;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{3,2,0,-4});
        ListNode tail = tail(head);
        ListNode node2 = search(head, 2);
        tail.next = node2;

        mianshiti0208 sol = new mianshiti0208();
        ListNode res = sol.detectCycle(head);
        if (res != null) System.out.println(res.val);
    }

    public static ListNode search(ListNode head, int val) {
        while (head != null && head.val != val) head = head.next;
        return head;
    }

    public static ListNode tail(ListNode head) {
        if (head == null) return null;
        while (head.next != null) head = head.next;

        return head;
    }
}
