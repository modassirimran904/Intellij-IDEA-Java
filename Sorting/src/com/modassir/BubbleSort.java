package com.modassir;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr= {1,37,3,2,55,44};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));

        int [] arr2 = { -23,-55,77,33,90,3,32,6};
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

    }
    static void Insertion(int[] arr){

    }


    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            // find the max item remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
    static int  getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i=start; i< end; i++){
            if (arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i=0; i<arr.length; i++){
            swapped = false;
            for (int j=1; j< arr.length -i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}