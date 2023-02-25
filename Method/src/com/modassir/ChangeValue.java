package com.modassir;


import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create array
        int arr[]={1,2,56,7,5,4,43};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0] =99;
    }
}
