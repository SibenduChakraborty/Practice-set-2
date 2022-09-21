package com.cyberdream;
import java.util.Scanner;
public class TCS {
    static int function(int n,int k, int[] arr){
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    System.out.println((i+1)+" "+(j+1));
                    return 0;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int[] arr= new int[n];
        for(int l=0;l<n;l++){
            arr[l]= sc.nextInt();
        }
        function(n,k,arr);
    }
}
