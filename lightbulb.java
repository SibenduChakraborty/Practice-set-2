package com.cyberdream;

import java.util.Scanner;
import java.lang.Math;
public class lightbulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[l + 1];
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                arr[temp] = 1;
            }
            int count = 0;
            int temp = 0;
            int head=0;
            int tail=0;
            for (int i = 0; i <= l; i++) {
                if (arr[i] == 0) {
                    temp++;
                } else {
                    if (temp > count) {
                        count = temp + 1;
                    }
                    temp = 0;
                }
            }
            for(int i=0;i<l;i++){
                if(arr[i]==0){
                    head++;
                }
                else{
                    break;
                }
            }
            for(int i=l-1;i>=0;i++){
                if(arr[i]==0){
                    tail++;
                }
                else{
                    break;
                }
            }
            int res= Math.max(head,tail);
            if((res+1)>=count){
                System.out.println(res+1);
            }
            else{
                System.out.println(count/2);
            }
        }
    }
}
