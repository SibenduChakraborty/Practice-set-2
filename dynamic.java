package com.cyberdream;

public class dynamic {
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
       for(int[] col : arr) {
           for (int row : col) {
               System.out.print(row+" ");
           }
           System.out.println();
       }
    }
}
