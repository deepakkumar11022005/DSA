package com.Service.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinaton {
    public static void main(String[] args) {
        int k=7;
        int arr[]={2,3,6,7};
        List<List<Integer>> res=new ArrayList<>();
        helper(res,arr,0,k,new ArrayList<>());
        System.out.println(res);
    }

    private static void helper(List<List<Integer>> res, int[] arr,int i, int k, ArrayList<Integer> ds) {
        if (i>=arr.length-1){
            if(k==0){
                res.add(new ArrayList<>(ds));
             }
            return;
        }
        if(arr[i]<=k){
            ds.add(arr[i]);
            helper(res,arr,i,k-arr[i],ds);
            ds.remove(ds.size()-1);
        }
        helper(res,arr,i+1,k,ds);
    }
}
