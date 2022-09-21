package com.cyberdream;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind= sc.nextInt();
        System.out.println("enter the value you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("the value at array index entered is " + marks[ind]);
            System.out.println("the value of array value / number is " + marks[ind] / number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred !");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException occurred !");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("exception occurred !");
            System.out.println(e);
        }
    }
}
