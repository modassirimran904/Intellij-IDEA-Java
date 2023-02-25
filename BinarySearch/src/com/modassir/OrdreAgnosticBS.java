package com.modassir;

public class OrdreAgnosticBS {
    public static void main(String[] args) {
        //int [] arr= {2,3,4,5,6,7,9,10,14,19};
        int[] arr= {18,17,16,12,10,9,6,4,2,1};
        int key = 2;
        System.out.println(orderAgnosticBS(arr, key));

    }
    static int orderAgnosticBS(int[] arr,int key){
        int start =0 ;
        int end= arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            // find middle element
            int mid = start + (end - start)/2;

            if (arr[mid] == key){
                return mid;
            }
            if (isAsc){
                if (key< arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid +1 ;
                }
            }
            else {
                if(key> arr[mid]){
                    end= mid-1;
                }
                else{
                    start= mid +1;
                }
            }
        }
        return  -1;
    }
}
