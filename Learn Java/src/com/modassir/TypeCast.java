package com.modassir;

import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextInt();  // right side is smaller and left side larger tyep then atometically converted
//        System.out.println(num);

        // this is Type casting
//        int num = (int )(348.43f);
//        System.out.println(num);

        // Atomatic type promotion in expression
//        int a = 259;
//        byte b = (byte) a;
//        System.out.println(b);

        byte a= 40;
        byte b= 50;
        byte c= 100;
        int d = ( a * b )/c;

        System.out.println(d);

    }
}
