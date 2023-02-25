package com.modassir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(99);
//        list.add(48);
//        list.add(99);
//        list.add(48);
//        list.add(99);
//        list.add(48);
//
//        list.set(1,100);
//        list.remove(1);
//
//        System.out.println(list);

        // input
        Scanner in = new Scanner(System.in);
        for (int i=0; i< 5; i++){
            list.add(in.nextInt());
        }
        for (int i=0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
