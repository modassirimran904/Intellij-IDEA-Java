package com.modassir;
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        // store a roll number
       // int a = 19;

        //Array
        // syntax
        // datatype[] variable_name = new datatype[size];

//        int [] rnos =new int [5];
//        // or directly
//        int [] rnos2 = { 33,44,5,6,77,44};

//        int[] rnos3; // decalaration of array ros is getting defined in the stack
//        rnos3 = new int[5]; // initialization: actually here object is being created in the memory heap
//        System.out.println(rnos3[0]);

        String[] arr = new String[5];
        System.out.println(arr[0]);

        for (String s : arr){
            System.out.println(s);
        }

    }
}