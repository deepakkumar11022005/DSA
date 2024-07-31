package com.Service.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Check {
    public static   void main(String[] args) {

        HashSet<List<Integer>> set = new HashSet<>();

        List<Integer> list1 =  new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(4, 5, 6));

        set.add(list1);
        set.add(list2); // This won't be added because list1 equals list2
        set.add(list3);

        System.out.println(set.size()); // Output will be 2
    }
}
