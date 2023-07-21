package com.recursionsecond;

import java.util.ArrayList;

public class subset {
    public static void printSubsets(ArrayList<Integer> subset){
        for (int i=0;i<subset.size();i++){
            System.out.println(subset.get(i)+ "");
        }
        System.out.println();
    }
    public static void findSubsequence(int n,ArrayList<Integer> subset){
        if (n==0){
            System.out.println(subset);
            return;
        }
        findSubsequence(n-1,subset);
        subset.add(n);
        findSubsequence(n-1,subset);
        subset.remove(subset.size()-1);
    }

    public static void main(String[] args) {
        int n=3;
        findSubsequence(n,new ArrayList<Integer>());
    }
}