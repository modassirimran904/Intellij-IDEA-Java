package com.modassir;

public class SearchMin {
    public static void main(String[] args) {
        int [] arr= {3,5,7,8,9,34,56,77,88,444,33};
        System.out.println(searchMin(arr));
    }
    static int searchMin(int[] mod ){
        int  result = mod[0];
        for (int i=1; i< mod.length; i++){
            if (mod [i] < result){
                result = mod[i];
            }
        }
        return result;
    }
}
