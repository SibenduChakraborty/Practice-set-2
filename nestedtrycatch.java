package com.cyberdream;

import java.util.Scanner;

public class nestedtrycatch {
    public static void main(String[] args) {
        int[] marks;
        Scanner sc = new Scanner(System.in);
        marks = new int[]{1, 2, 3};
        boolean flag = true;
        while (flag) {
            int ind = sc.nextInt();
            int n = sc.nextInt();
            try {
                System.out.println("initializing");
               // flag = false;
                try {
                    System.out.println(" marks[ind] / n :" + marks[ind] / n);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundException in level 2 " + e);
                    System.out.println(" try again :");
                }
            } catch (ArithmeticException e) {
                System.out.println("arithmetic exception in level 1 :" + e);
                System.out.println("try again :");
            }
        }
        System.out.println("thanks for using this program");
    }
}
