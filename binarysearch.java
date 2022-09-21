package com.cyberdream;

public class binarysearch {
    static int search1(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int res=0;
        while(start<=end){
            int mid = start + ( end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start= mid+1;
            } else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{0,1,2,3,4,5,6,7,9};
        int res= search1(arr,2 );
        System.out.println(res);
    }
}
