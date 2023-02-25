package com.modassir;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array of primitives
//        int [] abd = new int[5];
//        abd[0]= 10;
//        abd[1]= 30;
//        abd[2]= 40;
//        abd[3]= 50;
//        abd[4]= 60;

        //System.out.println(abd[1]);

        //input using for loop
//        for (int i=0; i< abd.length;i++){
//            abd[i] = input.nextInt();
//        }
//        // Display the number which is take by using for loop
//        for (int i=0 ; i< abd.length; i++){
//            System.out.print(abd[i]+ "  ");
//        }
//
//        //for each loop
//        for (int num : abd){ // for every element of array print the element
//            System.out.println(num + "  "); // num represent the element of the array
//        }
        // System.out.println(abd[5]);  // index out of bound error
       // System.out.println(Arrays.toString(abd));

        //Array objects
        String[]  str = new String[4];
        for (int i=0 ; i< str.length; i++)
        {
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Modassir";

        System.out.println(Arrays.toString(str));


    }
}
