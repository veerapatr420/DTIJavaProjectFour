package com.sau.aa;

public class Hey {
    public int a = 10; //instance variable
    public static int b = 20;//class variable

    public void showHi(){
        System.out.println("Hi...");
    }
    public static void showHey(){

    }

    public static void metA(){

        b = 22;
        showHey();
    }

    public static void metB(){
            //a = 11;error
            b = 22;
            //showHi(); error
            showHey();
    }

}