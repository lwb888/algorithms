package org.luwenbin888.algorithms.lecture.lecture15;

import org.luwenbin888.algorithms.lecture.lecture11.SortUtil;

import java.util.Arrays;

public class BinarySearch {
    public int binarySearch(int[] arr, int data) {
        if (arr == null || arr.length == 0) return -1;

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == data) return mid;
            else if (arr[mid] < data) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    private int binarySearch2(int[] arr, int data, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == data) return mid;
        else if (arr[mid] < data) return binarySearch2(arr, data, mid + 1, high);
        else return binarySearch2(arr, data, low, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = SortUtil.randomArray(10000);
        Arrays.sort(arr);

        BinarySearch sol = new BinarySearch();
        //int res = sol.binarySearch(arr, arr[600]);
        int res = sol.binarySearch2(arr, arr[600] * 10, 0, arr.length - 1);
        System.out.println(res);
    }
}
