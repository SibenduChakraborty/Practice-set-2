package com.cyberdream;

import java.util.Arrays;

public class twosum {
    static int[] sum(int[] nums, int target) {
        int[] res = new int[2];
        int length = nums.length;
        for(int k=0;k<length;k++){
            int pi= nums[k];
            for(int i=0; i<length; i++){
                if(pi+nums[i]==target*(-1)){
                    res[0]=pi;
                    res[1]=nums[i];
                    return res;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr= {1,7,-6,5,-2,4,-3,6};
        for(int i=0;i<arr.length; i++){
            System.out.print(Arrays.toString(sum(arr, arr[i])) + " " + arr[i]);
            System.out.println();
        }
    }
}

