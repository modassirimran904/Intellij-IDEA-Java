package com.modassir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arrl2d = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // Inititalization
        for (int i=0; i<3; i++){
            arrl2d.add(new ArrayList<>());
        }

        // add element
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++) {
                arrl2d.get(i).add(in.nextInt());
            }
        }
        System.out.println(arrl2d);
    }
}
