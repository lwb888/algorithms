package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0206 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        ListNode p = head, q = head, r = null, t = null;
        int len = 1;

        while (p.next != null) {
            p = p.next;
            len++;
            if (p.next != null) {
                p = p.next;
                len++;
            }

            t = q.next;
            q.next = r;
            r = q;
            q = t;
        }

        if (len == 1) return true;

        if (len % 2 != 0) {
            p = q.next;
        }
        else {
            p = q;
        }
        q = r;

        while (p != null) {
            if (p.val != q.val)  break;
            p = p.next;
            q = q.next;
        }

        return p == null;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{1});
        mianshiti0206 sol = new mianshiti0206();
        System.out.println(sol.isPalindrome(l1));
    }
}
