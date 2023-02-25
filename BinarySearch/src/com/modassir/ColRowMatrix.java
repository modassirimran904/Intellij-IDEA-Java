package com.modassir;

import java.util.Arrays;

public class ColRowMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {11,22,35,45},
                {28,29,37,48},
                {31,36,42,50}
        };
        int key = 5;
        System.out.println(Arrays.toString(search(arr, key)));
    }
    static int[] search (int [][]matrix, int target){
        int row =0 ;
        int col = matrix.length-1;

        while (row < matrix.length && col >= 0){
            if (matrix[row][col]== target){
                return new int []{row, col};
            }
            if ( matrix[row][col] < target){
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
