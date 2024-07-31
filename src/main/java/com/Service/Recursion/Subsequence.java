package com.Service.Recursion;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        int arr[]=new int[]{3,1,2};
        sub(arr,0,new ArrayList<>());
    }

    private static   void sub(int[] arr, int i, ArrayList<Integer> ds) {
        if(i>= arr.length) {
            System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        sub(arr,i+1,ds);
        ds.remove(ds.size()-1);
        sub(arr,i+1,ds);

    }
}
