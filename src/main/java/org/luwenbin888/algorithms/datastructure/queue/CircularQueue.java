package org.luwenbin888.algorithms.datastructure.queue;

public class CircularQueue implements Queue {

    private int[] items;
    private int front, tail;
    private int size;

    public CircularQueue() {
        this.size = 10;
        items = new int[size];
        front = tail = 0;
    }

    public CircularQueue(int size) {
        this.size = size;
        items = new int[size];
        front = tail = 0;
    }

    @Override
    public boolean enqueue(int data) {
        if ((tail + 1) % size == front) {
            System.out.println("queue full");
            return false;
        }

        items[tail] = data;
        tail = (tail + 1) % size;

        return true;
    }

    @Override
    public int dequeue() {
        if (front == tail) {
            System.out.println("queue empty");
            return -1;
        }

        int res = items[front];
        front = (front + 1) % size;

        return res;
    }

    @Override
    public int peek() {
        if (front == tail) return -1;

        return items[front];
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        Queue queue = new CircularQueue();
        for (int i = 0; i < 10; i++) queue.enqueue(i);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
