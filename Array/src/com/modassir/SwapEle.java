package com.modassir;

import java.util.Arrays;

public class SwapEle {
    public static void main(String[] args) {
        int[]  arr = { 2,3,5,8,22};

        System.out.println(Arrays.toString(arr));
        swap(arr, 0,3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
