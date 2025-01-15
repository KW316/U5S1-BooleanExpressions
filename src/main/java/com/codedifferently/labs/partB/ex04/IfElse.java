package com.codedifferently.labs.partB.ex04;
import java.util.Scanner;


public class IfElse {

    public static String equalToSeven(int x){
        String response = "";
        /* Put your code in between these comments : Top */
        if(x == 7){
            response = " That's lucky";
        }else{
            response = "That's unlucky";
        }

        /* Put your code in between these comments : Bottom */


        return response;
    }
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number");
        int num = keyboard.nextInt();
        System.out.println(equalToSeven(num));
    }
}
