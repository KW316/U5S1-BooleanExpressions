package com.codedifferently.labs.partB.ex01;

public class TempCheck {

    public static String bool(int a){
        String response= "";
        if( a <= 45){
            response = "It's cold - putting on a coat!";
        }else if(a <= 65){
            response = "It's not bad out - a hoodie will do just fine";
        }else{
            response = "It's hot - a T-shirt will be perfect";
        }



        return response;
    }
    public static void main(String args[]) {
        String booleanOutput = bool(45);
        System.out.println(booleanOutput);

    }
}
