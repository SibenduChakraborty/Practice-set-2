package com.cyberdream;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
//        return super.toString() + " I am tostring ";
        return "toString exception";
    }
    @Override
    public String getMessage() {
        //return super.getMessage() + " ''I am getMessage()'' ";
        return "I am getMessage";
    }
}
public class exceptionclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 99) {
            try {
                throw new MyException();
            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
            }
        }
    }
}
