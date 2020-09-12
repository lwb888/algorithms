package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;

        ListNode[] ps = new ListNode[lists.length];
        for (int i = 0; i < lists.length; i++) {
            ps[i] = lists[i];
        }

        ListNode res = new ListNode(0), p = res;
        while (true) {
            int currentMin = Integer.MAX_VALUE;
            int currentIdx = -1;
            for (int i = 0; i < lists.length; i++) {
                if (ps[i] != null && ps[i].val < currentMin) {
                    currentMin = ps[i].val;
                    currentIdx = i;
                }
            }

            if (currentIdx == -1) break;
            else {
                ListNode currentHead = ps[currentIdx];
                ps[currentIdx] = ps[currentIdx].next;
                currentHead.next = null;
                p.next = currentHead;
                p = p.next;
            }
        }

        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = LinkedListUtil.construct(new int[]{1,4,5});
        ListNode l2 = LinkedListUtil.construct(new int[]{1,3,4});
        ListNode l3 = LinkedListUtil.construct(new int[]{2,6});
        ListNode[] lists = new ListNode[]{l1, l2, l3};

        p23 sol = new p23();
        ListNode res = sol.mergeKLists(lists);
        LinkedListUtil.printLinkedList(res);
    }
}
