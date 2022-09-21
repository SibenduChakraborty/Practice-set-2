package com.cyberdream;
import java.util.Arrays;
public class selectionsort {

    public static int getmaxindex(int[] arr, int start, int end){
        int max=start;
         for(int i=start; i<=end;i++){
             if (arr[max]<arr[i]){
                     max=i;
         }
        }
        return max;
    }

    static void swap(int[] arr, int a , int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void selection(int[] arr){
       for(int i=0; i<arr.length;i++){
           int last = arr.length-1-i;
           int maxindex=getmaxindex(arr,0,last);
           swap(arr,maxindex,last);
       }
    }
    public static void main(String[] args) {
        int[] arr= {1,6,54,4,5,4,5,78,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
