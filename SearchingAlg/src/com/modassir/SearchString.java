package com.modassir;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name = "Modassirmk";
        char target = 'k';
        System.out.println(searchword2(name , target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean searchword2(String name , char target){
        if ( name.length()==0){
            return false;
        }
        for ( char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean searchword(String name , char target){
        if ( name.length()==0){
            return false;
        }
        for (int i=0 ; i< name.length(); i++){
           if( target == name.charAt(i)){
               return true;
           }
        }
        return false;
    }

}
