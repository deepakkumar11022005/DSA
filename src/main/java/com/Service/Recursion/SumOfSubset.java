package com.Service.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfSubset {
    public static void main(String[] args) {
        List<Integer> arr=   Arrays.asList(3,1,2);
        int n=arr.size();
        List<Integer> res=new ArrayList<>();
        subset(0,0,arr ,res);
        Collections.sort(res);
        System.out.println(res);
    }

    private static void subset(int i, int sum, List<Integer> arr, List<Integer> res) {
        if(i>=arr.size()) {
            res.add(sum);
            return;
        }

        subset(i+1,sum+ arr.get(i),arr,res);
        subset(i+1,sum,arr,res);

    }
}
