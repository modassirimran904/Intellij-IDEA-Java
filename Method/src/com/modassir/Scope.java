package com.modassir;
// Scope basically means we cannot access variable outside the function
// Any thing initialised inside the block then wen can not accessing outside the block
public class Scope {
    public static void main(String[] args) {
        int a =50 ;
        int b =60;
//        System.out.println(num);  //cannot access that varaible
//        System.out.println(marks); //cannot access that varaible

    }
    static void random(){
        int num = 90;
        int marks = 80;

        System.out.println(num); // only access inside the function which one is declare
        System.out.println(marks);
    }
}
