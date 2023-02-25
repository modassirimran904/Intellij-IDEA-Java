package com.modassir;

public class Shadowing {
    static int a =90; // this is shadowed at line 8

    public static void main(String[] args) {
        System.out.println(a); // the class variable at line is shadowed by this
        int a;
        //System.out.println(a); // scope will begin when value is initialized
        a = 88;
        System.out.println(a); //88

        fun();

    }
    static void fun(){
        System.out.println(a);

    }
}
