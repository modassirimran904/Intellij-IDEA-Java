package com.modassir;
public class If_Else {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int salary = 1000000;
        if ( salary <900000)
            salary = 20000+ salary;
        else
            salary = 100000+ salary;
        System.out.println(salary);
    }
}