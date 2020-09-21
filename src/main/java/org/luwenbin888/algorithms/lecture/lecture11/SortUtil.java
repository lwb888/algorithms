package org.luwenbin888.algorithms.lecture.lecture11;

import java.util.Random;

public class SortUtil {
    public static boolean check(int[] arr) {
        if (arr == null || arr.length == 0) return true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }

        return true;
    }

    public static int[] randomArray(int size) {
        if (size <= 0) return null;
        int[] res = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            res[i] = rand.nextInt(size * 10);
        }

        return res;
    }

    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) return;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
