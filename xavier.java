package com.cyberdream;

import java.util.Arrays;
import java.util.Scanner;

public class xavier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        while(n-->0){
            arr[arr.length-n-1]=sc.nextInt();
        }
        boolean flag=true;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == 1) {
                flag = false;
                break;
            }
        }
        System.out.println(flag? 0:arr.length-1);
    }
}
