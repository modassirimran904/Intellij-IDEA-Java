package com.modassir;

public class Max {
    public static void main(String[] args) {
        int [] arr = {100,2,3,43,33,55,32};
        System.out.println(max(arr));
        //System.out.println(maxRange(arr, 1,4));
    }
    // work on edge cases here, array being null
    static int maxRange(int[] arr, int start, int end){
        if (end>start){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxelement = arr[start];
        for (int i=start; i< end; i++){
            if (arr[i] > maxelement){
                maxelement = arr[i];
            }
        }
        return maxelement;
    }
    static int max(int[] arr){
        if (arr.length==0){
            return -1;
        }
        int maxelement = arr[0];
        for (int i=0; i< arr.length; i++){
            if (arr[i] > maxelement){
                maxelement = arr[i];
            }
        }
        return maxelement;
    }

}
