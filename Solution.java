package com.cyberdream;
import java.util.Scanner;

public class Solution {
    static boolean isprime(int n) {
        for (int i = 2; i < Math.sqrt(n)+1 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


         public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int m = 0, k = 0;
            int count = 0;
            int n= sc.nextInt();
            if (n == 0 || n == 1)
                System.out.println(m);

            for (int i = 2; i < n; i++) {
                if (isprime(i)) {
                    count++;
                    System.out.println(i);
                }
            }
             System.out.println(Math.sqrt(2)+1);
        }
    }
