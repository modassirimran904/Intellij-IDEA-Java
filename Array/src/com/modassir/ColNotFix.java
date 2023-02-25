package com.modassir;

public class ColNotFix {
    public static void main(String[] args) {
        int[][] arr2d = {
                {1,2,3},
                {4  ,6},
                {7,8,9,3}
        };
        for (int row=0; row <arr2d.length; row ++){
            for (int col =0; col< arr2d[row].length; col++){
                System.out.print(arr2d[row][col] + "  ");
            }
            System.out.println();
        }
    }


}
