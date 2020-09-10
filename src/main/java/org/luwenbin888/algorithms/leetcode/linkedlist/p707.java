package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p707 {

    static class ListNode {
        public int val;
        public ListNode next;
    }

    static class MyLinkedList {

        private ListNode head;
        int length = 0;
        private ListNode tail;

        /** Initialize your data structure here. */
        public MyLinkedList() {

        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index >= length) return -1;

            ListNode p = head;
            while (--index >= 0) {
                p = p.next;
            }

            return p.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            ListNode node = new ListNode();
            node.val = val;
            node.next = head;
            head = node;

            if (head.next == null) tail = head;

            length++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            ListNode node = new ListNode();
            node.val = val;

            if (head == null) {
                head = tail = node;
            }
            else {
                tail.next = node;
                tail = node;
            }

            length++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index > length) return;

            if (index == length) {
                addAtTail(val);
                return;
            }

            if (index == 0) {
                addAtHead(val);
                return;
            }

            ListNode node = new ListNode();
            node.val = val;

            ListNode p = head;
            int i = 0;
            while (++i < index) {
                p = p.next;
            }

            node.next = p.next;
            p.next = node;

            length++;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length) {
                return;
            }

            if (index == 0) {
                head = head.next;
                length--;
                return;
            }

            int i = 0;
            ListNode p = head;
            while (++i < index) {
                p = p.next;
            }

            if (p.next == tail) {
                tail = p;
            }
            p.next = p.next.next;
            length--;
        }
    }

    public static void main(String[] args) {

         MyLinkedList obj = new MyLinkedList();
         obj.addAtHead(1);
         obj.addAtTail(3);
         obj.addAtIndex(1,2);
         obj.get(1);
         obj.deleteAtIndex(1);
         obj.get(1);
    }
}
