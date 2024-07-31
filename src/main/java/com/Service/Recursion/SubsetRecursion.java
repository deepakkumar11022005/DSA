package com.Service.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetRecursion {

        public static void main(String[] args) {
            List<Integer> arr=   Arrays.asList(3,1,2);
            int n=arr.size();
            List<List<Integer>> res=new ArrayList<>();
            subset(0,arr ,new ArrayList<>(),res);

            System.out.println(res);
        }

        private static void subset(int i,   List<Integer> arr,List<Integer> ds, List<List<Integer>> res) {
            if(i>=arr.size()) {
                res.add(new ArrayList<>(ds));
                return;
            }
            ds.add(arr.get(i));
            subset(i+1,arr,ds,res);
            ds.remove(ds.size()-1);
            subset(i+1,arr,ds,res);

        }


}
