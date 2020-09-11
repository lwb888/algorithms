package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p725 {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int length = 0;
        ListNode p = root;

        while (p != null) {
            length++;
            p = p.next;
        }

        int[] splitPlan = new int[k];
        int parts = length / k;
        int remain = length % k;
        int i = 0;
        if (k >= length) {
            for (; i < length; i++) {
                splitPlan[i] = 1;
            }
            for (; i < k; i++) {
                splitPlan[i] = 0;
            }
        }
        else {
            for (i = 0; i < k; i++) splitPlan[i] = parts;
            for (i = 0; i < remain; i++) {
                splitPlan[i]++;
            }
        }

        ListNode[] res = new ListNode[k];
        p = root;
        for (i = 0; i < k; i++) {
            int len = splitPlan[i];
            ListNode l = new ListNode(0), q = l;
            while (len-- > 0) {
                q.next = p;
                q = q.next;
                ListNode n = p.next;
                p.next = null;
                p = n;
            }
            res[i] = l.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{});
        LinkedListUtil.printLinkedList(head);

        p725 sol = new p725();
        ListNode[] res = sol.splitListToParts(head, 3);
        for (ListNode root: res) {
            while (root != null) {
                System.out.print(root.val + "-->");
                root = root.next;
            }
            System.out.println();
        }
    }
}
