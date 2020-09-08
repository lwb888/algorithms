package org.luwenbin888.algorithms.datastructure.linkedlist;

import java.util.List;

/**
 * @author lwb888
 * Geektime algorithms lecture 6
 */
public class LinkedList {

    private LinkedListNode head;
    private LinkedListNode tail;

    public LinkedList() {

    }

    /**
     * Appends data to the tail
     * @param data
     */
    public void append(int data) {
        LinkedListNode node = new LinkedListNode();
        node.data = data;
        if (head == null) head = node;
        else tail.next = node;

        tail = node;
    }

    /**
     * Search data in the linked list, if found, return the node
     * @param data
     * @return LinkedListNode
     */
    public LinkedListNode search(int data) {
        LinkedListNode p = head;
        while (p != null && p.data != data) {
            p = p.next;
        }

        if (p == null) return null;
        else return p;
    }

    /**
     * Search data in the linked list and return index of the node
     * @param data
     * @return index of linked list node that matches data
     */
    public int indexOf(int data) {
        LinkedListNode p = head;
        int i = 0;
        while (p != null && p.data != data) {
            i++;
            p = p.next;
        }

        if (p == null) i = -1;
        return i;
    }

    /**
     * Deletes node that matches data
     * @param data
     * @return The node that are deleted
     */
    public LinkedListNode delete(int data) {
        LinkedListNode p = head, q = null;
        while (p != null && p.data != data) {
            q = p;
            p = p.next;
        }

        if (p == null) return null;
        if (p == head) head = head.next;
        else q.next = p.next;

        return p;
    }

    /**
     * Reverses the linked list
     */
    public void reverse() {
        if (head == null) return;

        LinkedListNode p = head, q = null, nextP = null;
        while (p != null) {
            nextP = p.next;

            p.next = q;
            q = p;
            p = nextP;
        }

        head = q;
    }

    /**
     * Deletes last element from linked list
     */
    public LinkedListNode deleteLast() {
        if (head == null) return null;

        LinkedListNode p = head, q = null;
        while (p.next != null) {
            q = p;
            p = p.next;
        }

        if (p == head) head = null;
        else {
            q.next = null;
        }

        return p;
    }

    public LinkedListNode appendFirst(int data) {
        LinkedListNode node = new LinkedListNode();
        node.data = data;
        node.next = head;
        head = node;

        return node;
    }

    /**
     * toString
     * @return String representation of the linked list
     */
    @Override
    public String toString() {
        if (head == null) return "";
        StringBuilder result = new StringBuilder();

        LinkedListNode p = head;
        String sep = "";
        while (p != null) {
            result.append(sep + p.data);
            sep = "-->";
            p = p.next;
        }

        result.append("-->NULL");

        return result.toString();
    }

    public static LinkedList construct(List<Integer> elements) {
        LinkedList list = new LinkedList();
        for (int elem: elements) {
            list.append(elem);
        }

        return list;
    }
}
