package com.cyberdream;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={3,5,4,6,2,1};
        bubble(arr);
        for(int e:arr){
            System.out.print(e + " , ");
        }
    }
    static void bubble(int[] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
