package org.luwenbin888.algorithms.lecture.lecture12;
import org.luwenbin888.algorithms.lecture.lecture11.SortUtil;

public class MergeSort {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int p, int q) {
        if (p >= q) return;
        int r = (p + q) / 2;
        mergeSort(arr, p, r);
        mergeSort(arr, r + 1, q);
        merge(arr, p, r, q);
    }

    private void merge(int[] arr, int p, int r, int q) {
        int[] res = new int[q - p + 1];
        int i = p, j = r + 1;
        int k = 0;
        while (i <= r && j <= q) {
            if (arr[i] <= arr[j]) {
                res[k++] = arr[i];
                i++;
            }
            else {
                res[k++] = arr[j];
                j++;
            }
        }
        if (i <= r) {
            for (; i <= r; i++) {
                res[k++] = arr[i];
            }
        }
        if (j <= q) {
            for (; j <= q; j++) {
                res[k++] = arr[j];
            }
        }

        for (i = 0; i < res.length; i++) {
            arr[p + i] = res[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.randomArray(20);
        SortUtil.printArray(arr);
        MergeSort sol = new MergeSort();
        sol.sort(arr);
        if (!SortUtil.check(arr)) System.out.println("Check failed");
        SortUtil.printArray(arr);
    }
}
