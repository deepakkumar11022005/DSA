package com.Service.Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={8,1,2,0,63,8,2,95,6,52,441,6,6};
        sorting(arr, 0, arr.length - 1);
        for(int i: arr) {
            System.out.println(i);
        }
    }

    private static void sorting(int[] arr, int low, int high) {
        if(low<high){
            int i=low;
            int j=high;
            int pivot=low;
            while(i<j){
                while( i<=high &&arr[i]>=arr[pivot])
                    i++;
                while(  j>=low &&arr[j]<arr[pivot])
                    j--;
                if(i<j)
                {
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            int t=arr[j];
            arr[j]=arr[pivot];
            arr[pivot]=t;
            sorting(arr, low, j-1);
            sorting(arr, j+1,  high);
        }
    }
}
