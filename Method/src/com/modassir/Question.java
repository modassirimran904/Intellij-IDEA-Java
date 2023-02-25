package com.modassir;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i =0; i<1000;i++)
        {
            if (isArmstrong(i))
            {
                System.out.print(i+ "  ");
            }
        }

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum=0;

        while ( n>0)
        {
            int rem = n%10;
            n = n / 10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
    static boolean isPrime(int n){
        if (n<=1) {
            return false ;
        }
        int c=2;
        while (c * c <= n){
            if (n % c == 0)
                return false;
        }
        c++;
        if (c * c > n){
            return true;
        }
        return false;

    }
}
