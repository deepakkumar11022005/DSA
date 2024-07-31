package com.Service.Recursion;

import java.util.ArrayList;

public class SumOfSubsequenceIsK {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,1};
        int sum=2;
        sub(arr,0,0,sum,new ArrayList<>());
    }

    private static boolean sub(int[] arr, int i, int res,int sum, ArrayList<Integer> l) {
        if (i >= arr.length) {
            if (res == sum) {
                System.out.println(l);
                return true;
            }
            return false;
        }

        l.add(arr[i]);
        res += arr[i];
        if (sub(arr, i + 1, res, sum, l) == true) return true;
        l.remove(l.size() - 1);
        res -= arr[i];
        if (sub(arr, i + 1, res, sum, l) == true) return true;
        return  false;
    }
    }

