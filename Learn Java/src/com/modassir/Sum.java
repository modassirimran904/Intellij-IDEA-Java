package com.modassir;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        int num1 = number.nextInt();
        int num2 = number.nextInt();

        int sum = num1+num2;
        System.out.println("Sum is : "+ sum);

    }
}
