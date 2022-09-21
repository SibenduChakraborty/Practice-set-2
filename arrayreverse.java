package com.cyberdream;

public class arrayreverse {
    static void reverse(int[] arr){
        for (int i=0;i<=arr.length/2 ; i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5};
        reverse(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
