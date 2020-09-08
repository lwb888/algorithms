package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p1290 {
    public int getDecimalValue(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }

        p = head;
        int idx = len-1;
        int result = 0;
        while (p != null) {
            if (p.val == 1) {
                result += Math.pow(2, idx);
            }

            idx--;

            p = p.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1, 0, 1});
        p1290 sol = new p1290();
        int data = sol.getDecimalValue(head);
        System.out.println(data);
    }
}
