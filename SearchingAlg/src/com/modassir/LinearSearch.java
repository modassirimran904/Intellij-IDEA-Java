package com.modassir;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 22,344,239,38, 484,30, 80};

        int target = 480;
        int result = LinearSearch(arr , target);
        System.out.println(result);
    }
    static int LinearSearch(int[] arr , int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
