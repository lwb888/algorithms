package org.luwenbin888.algorithms.lecture.lecture11;

public class SelectionSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) return;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = -1, min = Integer.MAX_VALUE;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    minIdx = j;
                    min = arr[j];
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = min;
        }
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.randomArray(20);
        SortUtil.printArray(arr);
        SelectionSort sol = new SelectionSort();
        sol.sort(arr);
        if(!SortUtil.check(arr)) System.out.println("Check failed");
        SortUtil.printArray(arr);
    }
}
