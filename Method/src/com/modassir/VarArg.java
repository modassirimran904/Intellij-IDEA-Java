package com.modassir;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun("Modassir","Ali","Abdul","kalam");
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void Multiple(int a,int b, String ...v){
        System.out.println(v);
    }
}
