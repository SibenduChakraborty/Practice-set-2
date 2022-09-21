package com.cyberdream;
import java.util.Arrays;
public class arrayasdsc {
    public static void main(String[] args) {
        int[] arr= {1,5,6,74,8,4,12,1,4,5,8,4,12,2};
        int target = arr.length/2;
        int[] arr1= new int[target];
        int[] arr2= new int[target];
        int count=0;
       for(int i=0; i<target; i++){
           arr1[i] = arr[i];
       }
        int count1=0;
       for(int j=target; j<=arr.length-1; j++){
           arr2[count1] = arr[j];
            count1++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i: arr1){
            System.out.print(i+" ");
        }
        int j=arr2.length-1;
        while(j>=0){
            System.out.print(arr2[j]+" ");
            j--;
        }
    }
}
