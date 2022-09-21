package com.cyberdream;

import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        Scanner sc= new Scanner(System.in);
        int ind= sc.nextInt()-1;
        if (arr.length - 1 - ind >= 0)
            System.arraycopy(arr, ind + 1, arr, ind, arr.length - 1 - ind);
        arr[arr.length-1]= 0;
        for(int i:arr){
            System.out.print(i + " ");
        }
    }
}
