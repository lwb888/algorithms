package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class jzoffer06 {

    private List<Integer> result = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            result.add(p.val);
            p = p.next;
        }

        int size = result.size();
        int[] arr = new int[result.size()];
        for (int i = 0; i< result.size(); i++) {
            arr[size - i - 1] = result.get(i);
        }

        return arr;
    }

    public int[] reversePrint2(ListNode head) {
        reverse(head);
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }

    private void reverse(ListNode head) {
        if (head == null) return;

        reverse(head.next);
        result.add(head.val);
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{1,2,3});
        jzoffer06 sol = new jzoffer06();
        int[] arr = sol.reversePrint2(head);
        for (int i: arr) System.out.print(i + ", ");
        System.out.println();
    }
}
