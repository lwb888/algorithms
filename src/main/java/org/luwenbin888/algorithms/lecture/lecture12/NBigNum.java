package org.luwenbin888.algorithms.lecture.lecture12;

public class NBigNum {
    private int partition(int[] arr, int p, int q) {
        if (arr == null || arr.length == 0) return -1;
        if (p >= q) return p;

        int i = p, j = p;
        for (; j < q; j++) {
            if (arr[j] < arr[q]) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;

                i++;
            }
        }

        int tmp = arr[i];
        arr[i] = arr[q];
        arr[q] = tmp;

        return i;
    }

    public int nBigNum(int[] arr, int nth) {
        int p = 0, q = arr.length - 1;
        nth = nth - 1;
        int r;
        while ((r = partition(arr, p, q)) != nth) {
            if (nth < r) {
                q = r - 1;
            }
            else {
                p = r + 1;
            }
        }

        return arr[nth];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,12,3};
        NBigNum sol = new NBigNum();
        System.out.println(sol.nBigNum(arr, 3));
    }
}
