package com.cyberdream;

import java.util.Arrays;

public class selection2 {
   static void selection(int[] arr){
       for(int i=0;i<arr.length;i++){
           int fm=findmax(arr,0,arr.length-1-i);
           int temp= arr[fm];
           arr[fm]=arr[arr.length-1-i];
           arr[arr.length-1-i]=temp;
       }
   }
   static void insertion2(int[] arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j>0;j--){
               if(arr[j]<arr[j-1]){
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
               }
               else{
                   break;
               }
           }
       }
   }
    private static int findmax(int[] arr, int start, int end){
       int max= start;
       for(int i=start;i<=end;i++){
           if(arr[i]>arr[max]){
               max=i;
           }
       }
       return max;
    }
    public static void main(String[] args) {
        int[] arr= {2,6,4,5,8,7,9,10};
        //selection(arr);
        insertion2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
