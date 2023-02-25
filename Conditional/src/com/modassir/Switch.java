package com.modassir;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits){
            case "Mangos":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Banana":
                System.out.println("A happiest fruits");
                break;
            case "Graphs":
                System.out.println(" A small fruits");
                break;
            case "Orange":
                System.out.println("A round fruits");
                break;
            default:
                System.out.println("Please enter the valid fruits");
        }
    }
}
