package com.Service.Recursion;

public class SubString {
    public static void main(String[] args) {
        Character arr[]={'a','b','c'};
        int n=arr.length;
        for(int i=0;i<(1<<n);i++)
        {
            String s="";
            for(int j=0;j<n;j++)
            {
                if((i & (1<<j))==0)
                    s+=arr[j];
            }
            System.out.println(s);
        }
    }
}
