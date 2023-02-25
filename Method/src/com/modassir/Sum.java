package com.modassir;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(37,73);
        System.out.println(ans);
    }

    //pass the value of number when you calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    // return the value
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = input.nextInt();
        System.out.println("Enter second number ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
