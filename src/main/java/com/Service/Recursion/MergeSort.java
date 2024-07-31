package com.Service.Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={8,1,2,0,63,8,2,95,6,52,441,6,6};
        partition(arr, 0, arr.length - 1);
        for(int i: arr) {
            System.out.println(i);
        }
    }

    private static void partition(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            partition(arr, low, mid);
            partition(arr, mid + 1, high);
            mergeArray(arr, low, mid, high);
        }
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {
        int[] res = new int[high - low + 1];
        int i = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                res[i++] = arr[left++];
            } else {
                res[i++] = arr[right++];
            }
        }

        while (left <= mid) {
            res[i++] = arr[left++];
        }

        while (right <= high) {
            res[i++] = arr[right++];
        }

        System.arraycopy(res, 0, arr, low, res.length);
    }
}
