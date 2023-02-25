package com.modassir;

public class Ceiling {
    public static void main(String[] args) {
        int [] array = {2,4,7,8,11,14,16,19};

        int key = 20;
        System.out.println(ceiling(array, key));
    }
    static int ceiling(int[] arr, int key){
        int start=0;
        int end= arr.length- 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (key < arr[mid]){
                end = mid -1;
            }
            else if (key> arr[mid]){
                start= mid +1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
