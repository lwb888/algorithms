package org.luwenbin888.algorithms.lecture.lecture11;

public class InsertionSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) return;

        for (int i = 1; i < arr.length; i++) {
            int inserter = arr[i];
            int j = i - 1;
            while (j >=0 && arr[j] > inserter) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = inserter;
        }
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.randomArray(30);
        SortUtil.printArray(arr);
        InsertionSort sol = new InsertionSort();
        sol.sort(arr);
        if (!SortUtil.check(arr)) System.out.println("Check failed");

        SortUtil.printArray(arr);
    }
}
