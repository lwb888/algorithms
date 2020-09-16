package org.luwenbin888.algorithms.datastructure.queue;

public interface Queue {
    boolean enqueue(int data);
    int dequeue();
    int peek();
    int size();
}
