package com.cyberdream;
import java.util.Arrays;
import java.util.Scanner;
public class cuts {
    //*************************************
    static int RD(int[] a, int n)
    {
        int temp=-1;
        int r=0;
        for(int i=0;i<n;i++)

        {if(a[i]!=temp && a[i]>0)
        {
            r++;
        }
            temp=a[i];
        }
        return r;
    }
    //*********************************************
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count= sc.nextInt();
        for(int i=0; i<count; i++){
            int a= sc.nextInt();
            int[] x= new int[a];
            for(int j=0; j<a; j++){
                int temp = sc.nextInt();
                    x[j] = temp;
            }
            Arrays.sort(x);
            int res=0;
            res= RD(x, x.length);
           System.out.println(res);
        }
    }
}
