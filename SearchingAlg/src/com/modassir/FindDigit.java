package com.modassir;

public class FindDigit {
    public static void main(String[] args) {
        int[] numbers = {33,44423,4848,222,9,39399,30};
        int ans = findDigitEven(numbers);
        System.out.println(ans);
//        System.out.println(digit(33939));
//        System.out.println(even(49343));
    }
    static int findDigitEven(int[] nums){
        int count=0;
        for (int x: nums){
            if (even(x)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberDigit = digit(num);
        if (numberDigit % 2 == 0){
            return true;
        }
        return false;
    }
    static int digit (int num){
        int count=0;
        while(num >0){
            count++;
            num= num/10;
        }
        return count;
    }
}
