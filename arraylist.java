package com.cyberdream;
import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> MyList = new ArrayList<>();
        MyList.add(1);
        MyList.add(1);
        MyList.add(1);
        MyList.add(1);
        MyList.add(1);MyList.add(1);
        System.out.println(MyList.contains(1));
        System.out.println(MyList.contains(0));
        System.out.println(MyList);
        MyList.set(0, 2077);
        MyList.remove(0);
        System.out.println(MyList);
        for (int i=0; i<5;i++){
            MyList.add(i);
            System.out.println(MyList);
        }
        for (int i= 0; i<MyList.size();i++){
            MyList.remove(MyList.size()-1-i);
            System.out.println(MyList);
        }
        System.out.println(MyList);
    }
}
