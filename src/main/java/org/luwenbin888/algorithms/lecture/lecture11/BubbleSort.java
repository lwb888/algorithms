package org.luwenbin888.algorithms.lecture.lecture11;

import java.util.Random;

public class BubbleSort {
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            boolean exchanged = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    exchanged = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if (!exchanged) break;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = rand.nextInt(1000);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        BubbleSort sort = new BubbleSort();
        sort.sort(arr);
        for (int i = 0; i < 20; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
