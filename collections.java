package com.cyberdream;

import java.util.ArrayList;
import java.util.LinkedList;

public class collections {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(1);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(2);
        l1.addAll(l2);
        for(int i: l1){
            System.out.println(i);
        }
        System.out.println(l1.contains(3));
        System.out.println(l1.indexOf(6));
    }
}
