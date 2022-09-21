package com.cyberdream;
import java.util.Scanner;
public class seiveoferatosthenes {
    static void primeS(int n){
        int[] prime = new int[100];
        for(int i =2; i<=n;i++){
            if(prime[i] ==0){
                for(int j=i*i ; j<=n ; j+=i){
                    prime[j]=1;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(prime[i] == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number under 100 :");
        int n = sc.nextInt();
        primeS(n);
    }
}
