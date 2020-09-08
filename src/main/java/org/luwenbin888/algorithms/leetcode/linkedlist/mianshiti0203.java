package org.luwenbin888.algorithms.leetcode.linkedlist;

public class mianshiti0203 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
