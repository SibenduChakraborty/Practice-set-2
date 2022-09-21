package com.cyberdream;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] nums= {3,4,5,4,6,5,0};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 2077;
    }
}
