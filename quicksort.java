package com.cyberdream;

import java.util.Arrays;

public class quicksort {
    static void qsort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s= low;
        int e= hi;
        int m= s+(e-s)/2;
        int pivot = nums[m];

        while (s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp= nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;e--;
            }
        }
        qsort(nums, low,e);//as end is before start now and swapped
        qsort(nums,s,hi);
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,6,5};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
