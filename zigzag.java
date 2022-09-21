package com.cyberdream;
import java.util.Arrays;
public class zigzag {
    public static void main(String[] args) {
        int[] arr={5,2,1,4,3,6};
        Arrays.sort(arr);
        //1,2,3,4,5,6
        //1   3   5
        //  2   4   6
        //1 3 2 5 4 6
        for(int i=1;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
