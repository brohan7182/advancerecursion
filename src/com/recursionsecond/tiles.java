package com.recursionsecond;

public class tiles {
    public static int printTiles(int n,int m){
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        int vertTiles=printTiles(n-m,m);
        int horizontalTiles=printTiles(n-1,m);
        return vertTiles+ horizontalTiles;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(printTiles(n,m));
    }
}
