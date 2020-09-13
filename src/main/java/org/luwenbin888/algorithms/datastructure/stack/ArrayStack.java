package org.luwenbin888.algorithms.datastructure.stack;

public class ArrayStack implements Stack {
    private int[] data;
    private int head = -1;
    private int size;

    public ArrayStack() {
        this.size = 10;
        data = new int[this.size];
    }

    public ArrayStack(int size) {
        this.size = size;
        data = new int[this.size];
    }

    @Override
    public boolean push(int d) {
        if (head == size - 1) return false;

        head++;
        data[head] = d;

        return true;
    }

    @Override
    public Integer pop() {
        if (head == -1) return null;
        int res = data[head];
        head--;

        return res;
    }

    @Override
    public boolean isEmpty() {
        return head == -1;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) return null;
        return data[head];
    }
}
