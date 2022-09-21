package com.cyberdream;
import java.util.Arrays;
import java.util.Scanner;

public class hackerrank {

    static int[] left(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int d= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int j=0;j<d;j++){
            left(arr);
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
