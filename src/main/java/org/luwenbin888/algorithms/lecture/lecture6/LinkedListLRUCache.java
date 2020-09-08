package org.luwenbin888.algorithms.lecture.lecture6;

import org.luwenbin888.algorithms.datastructure.linkedlist.LinkedList;
import org.luwenbin888.algorithms.datastructure.linkedlist.LinkedListNode;

public class LinkedListLRUCache {
    // linked list for cached elements
    private LinkedList cache = new LinkedList();
    // max length and current length
    private int maxLen, len = 0;

    public LinkedListLRUCache(int maxLen) {
        this.maxLen = maxLen;
    }

    /**
     * Adds a cache data into LRU cache
     * @param data
     */
    public void add(int data) {
        if (len == maxLen) {
            cache.deleteLast();
            cache.appendFirst(data);
        }
        else {
            cache.appendFirst(data);
            len++;
        }
    }

    /**
     * Get cache element that matches data
     * @param data
     * @return element
     */
    public Integer get(int data) {
        LinkedListNode element = cache.delete(data);
        if (element == null) return null;
        cache.appendFirst(data);

        return element.data;
    }

    public void printCacheData() {
        System.out.println(cache.toString());
    }
}
