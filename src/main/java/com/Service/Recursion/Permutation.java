package com.Service.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        List<List<Integer>> res=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        ArrayList<Integer> ds=new ArrayList<>();
        permute(arr,res,ds,freq);
        System.out.println(res);
    }

    private static void permute(int[] arr, List<List<Integer>> res, ArrayList<Integer> ds, boolean[] booleans) {
        if(ds.size()==arr.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i< arr.length;i++)
        {
            if(!booleans[i]){
                booleans[i]=true;
                ds.add(arr[i]);
                permute(arr,res,ds,booleans);
                ds.remove(ds.size()-1);
                booleans[i]=false;
            }
        }
    }
}
