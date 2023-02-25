package com.modassir;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] mod = {2,3,4,5,67,9};
        System.out.println(Arrays.toString(mod));
        change(mod);
        System.out.println(Arrays.toString(mod));
        }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
