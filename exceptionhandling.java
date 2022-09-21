package com.cyberdream;

public class exceptionhandling {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("the result is " + c);

        } catch (Exception e) {
            System.out.println("failed calculation, reason: ");
            System.out.println(e);
        }
        System.out.println("end");
    }
}
