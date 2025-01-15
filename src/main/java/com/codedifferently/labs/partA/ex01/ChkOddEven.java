package com.codedifferently.labs.partA.ex01;

import java.util.Scanner;

public class ChkOddEven {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
        System.out.println(ChkOddEven.oddEven(num));

    }
    public static String oddEven(int a){
        String response = "";
        if(a % 2 == 0){
            response = " The num is even " + a;
        }else{
            response = " The num is odd " + a;
        }
        return response;

    }

}
