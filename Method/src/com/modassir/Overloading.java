package com.modassir;

public class Overloading {
    public static void main(String[] args) {
        fun(373);
        fun("Modassir Imran");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun (String naam){
        System.out.println(naam);
    }
}
