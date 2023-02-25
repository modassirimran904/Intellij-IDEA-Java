package com.modassir;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String naam = input.next();

        String personalised=  mygreet( naam );
        System.out.println(personalised);
    }
    static String mygreet(String name){
        String messege = "Hello "+ name ;
        return messege;
    }
}
