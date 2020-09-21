package org.luwenbin888.algorithms.lecture.lecture12;

import org.luwenbin888.algorithms.lecture.lecture11.SortUtil;

public class QuickSort {
    private int partition(int[] arr, int p, int r) {
        if (arr == null || arr.length == 0) return -1;
        int i = p, j = p;
        for (; j < r; j++) {
            if (arr[j] < arr[r]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;

                i++;
            }
        }

        int tmp = arr[r];
        arr[r] = arr[i];
        arr[i] = tmp;

        return i;
    }

    public void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private void quicksort(int[] arr, int p, int r) {
        if (p >= r) return;
        int q = partition(arr, p, r);
        quicksort(arr, p, q - 1);
        quicksort(arr, q + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.randomArray(30);
        SortUtil.printArray(arr);
        QuickSort sol = new QuickSort();
        sol.sort(arr);
        if (!SortUtil.check(arr)) System.out.println("Array not in order...");
        SortUtil.printArray(arr);
    }
}
