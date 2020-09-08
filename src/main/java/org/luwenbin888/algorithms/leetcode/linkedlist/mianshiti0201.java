package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class mianshiti0201 {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode p = head, q = null;
        Set<Integer> visited = new HashSet<>();

        while (p != null) {
            if (visited.contains(p.val)) {
                q.next = p.next;
            }
            else {
                visited.add(p.val);
                q = p;
            }
            p = p.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,1,1,1,2});
        LinkedListUtil.printLinkedList(head);
        mianshiti0201 sol = new mianshiti0201();
        head = sol.removeDuplicateNodes(head);
        LinkedListUtil.printLinkedList(head);
    }
}
