package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0202 {
    static class Solution {
        public int kthToLast(ListNode head, int k) {
            ListNode p = head, q = head;

            int gap = 1;
            while (gap++ < k) {
                p = p.next;
            }

            while (p.next != null) {
                q = q.next;
                p = p.next;
            }

            return q.val;
        }
    }

    public static void main(String[] args) {
        ListNode head = null, p = null;
        for (int i = 1; i <= 5; i++) {
            ListNode node = new ListNode(i);
            if (head == null) head = p = node;
            else {
                p.next = node;
                p = node;
            }
        }

        p = head;
        while (p != null) {
            System.out.print(p.val + "-->");
            p = p.next;
        }
        System.out.println();

        Solution sol = new Solution();
        System.out.println(sol.kthToLast(head, 5));
    }
}
