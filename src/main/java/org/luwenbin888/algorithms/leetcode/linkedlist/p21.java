package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), current = result;
        ListNode p = l1, q = l2;
        while (p != null && q != null) {
            if (p.val < q.val) {
                current.next = p;
                p = p.next;
            }
            else {
                current.next = q;
                q = q.next;
            }

            current = current.next;
        }

        if (p != null) current.next = p;
        else if (q != null) current.next = q;

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{1,2,3,5,6});
        ListNode l2 = LinkedListUtil.construct(new int[]{1,3,4});

        p21 sol = new p21();
        ListNode result = sol.mergeTwoLists(l1, l2);
        LinkedListUtil.printLinkedList(result);
    }
}
