package org.luwenbin888.algorithms.lecture.lecture16;

public class BinarySearch {
    public static int firstMatch(int[] arr, int data) {
        if (arr == null || arr.length == 0) return -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < data) low = mid + 1;
            else if (arr[mid] > data) high = mid - 1;
            else {
                if (mid == 0 || arr[mid - 1] != data) return mid;
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int lastMatch(int[] arr, int data) {
        if (arr == null || arr.length == 0) return -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < data) low = mid + 1;
            else if (arr[mid] > data) high = mid - 1;
            else {
                if (mid == arr.length - 1 || arr[mid + 1] != data) return mid;
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8,8,8,11,18};
        BinarySearch sol = new BinarySearch();
        System.out.println(sol.firstMatch(arr, 8));

        System.out.println(sol.lastMatch(arr, 8));
    }
}
