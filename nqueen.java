package com.cyberdream;

import java.util.Scanner;

public class nqueen {
    static boolean safe(int[][] arr, int x, int y, int n){
        for(int row= 0; row<x ; row++){
            if(arr[row][y]==1){//if 1 then there is a queen
                return false;
            }
        }
        int row=x;// iterator
        int col=y;// iterator
        while(row>=0 && col>=0){
            if(arr[row][col]==1){
                return false;
            }
            row--;
            col--;// checking north-west
        }
        row=x;// reset value
        col=y;// reset value
        while(row>=0 && col<n){
            if(arr[row][col]==1){
                return false;
            }
            row--;
            col++;// checking north-east
        }
        return true;
    }
    // the main function :
    static boolean queen(int[][] arr, int x, int n/* no y because after placing, no need to check in that row*/){
        if(x>=n){
            return true;
        }
        for (int col=0;col<n;col++){
            if(safe(arr,x,col,n)){
                arr[x][col]=1;
                if(queen(arr,x+1,n)){
                    return true;
                }
                arr[x][col]=0;//backtracking
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        if(queen(arr,0,n)){
            for (int i=0; i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
