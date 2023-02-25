package com.modassir;

import java.util.Arrays;
import java.util.Scanner;

public class TwpDimensional {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int[][] arr2d = new int[3][3];
//        System.out.println(arr2d.length); // number of rows
        int[][] arr2d = {
                {1,2,3},
                {4  ,6},
                {7,8,9,3}
        };
//        System.out.println(Arrays.toString(arr2d1));

        // Input of two D array
//        for (int row=0; row < arr2d.length; row ++){
//            // for each col in every row
//            for (int col =0; col< arr2d[row].length; col++){
//                arr2d[row][col] = input.nextInt();
//            }
//        }
        // Output of the array
        for (int row=0; row <arr2d.length; row ++){
            for (int col =0; col< arr2d[row].length; col++){
                System.out.print(arr2d[row][col] + "  ");
            }
            System.out.println();
        }
        // or other output way
//        for (int row =0; row < arr2d.length; row++){
//            System.out.println(Arrays.toString(arr2d[row]));
//        }

        // or enhance for each loop for output
        for (int []x: arr2d){
            System.out.println(Arrays.toString(x));
        }
    }
}
