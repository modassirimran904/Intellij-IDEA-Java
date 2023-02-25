package com.modassir;

import java.util.Arrays;

public class Search2dArr {
    public static void main(String[] args) {
        int[][] arr2d = {
                {2, 3, 4, 5},
                {66, 44, 22},
                {22, 33, 44, 55}
        };
//        int key = 2;
//        int[] result = search2darray(arr2d, key);
//        System.out.println(search2darray(arr2d, key));

        System.out.println(max(arr2d));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    static int[] search2darray(int[][] arr2d, int key) {
        if (arr2d.length == 0) {
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d.length; col++) {
                if (arr2d[row][col] == key) {
                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }
    static int max (int [][] arr ){
        int max = Integer.MIN_VALUE;
        for(int[]  ints : arr){
            for(int element : ints){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}