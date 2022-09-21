package com.cyberdream;

import java.util.Arrays;

public class insertionsort {
    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void insertionsort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else   {//VVI
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,6,54,4,5,4,5,78,0};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
