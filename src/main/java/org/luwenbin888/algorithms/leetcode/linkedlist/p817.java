package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class p817 {
    public int numComponents(ListNode head, int[] G) {

        if (head == null) return 0;

        Set<Integer> gset = new HashSet<>();
        for (int a: G) gset.add(a);

        int res = 0;
        ListNode p = head;
        boolean mode = false;
        while (p!= null) {
            if (gset.contains(p.val)) {
                if (!mode) {
                    mode = true;
                    res++;
                }
            }
            else {
                mode = false;
            }
            p = p.next;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode head = LinkedListUtil.construct(new int[]{0,1,2,3,4});
        int[] G = new int[]{0,3,1,4};
        p817 sol = new p817();
        int res = sol.numComponents(head, G);

        System.out.println(res);
    }
}
