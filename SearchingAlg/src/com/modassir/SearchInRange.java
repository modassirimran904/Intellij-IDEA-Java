package com.modassir;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23,45,36,47,33,43};
        int target = 36;
        System.out.println(linearSearch(arr, target, 1,4));
        display(arr);
        System.out.println();
        System.out.println("Target value is : " + target);
    }
    static void display(int[] mod){
        for (int i=0; i<mod.length; i++){
            System.out.print(mod[i]+ "  ");
        }
    }

    static boolean linearSearch(int []  mod, int target, int start, int end  ){
        if ( mod.length == 0){
            return false;
        }
        for (int i=start; i<end ; i++){
            if (target== mod[i]) {
                return true;
            }
        }
        return false;
    }
}
