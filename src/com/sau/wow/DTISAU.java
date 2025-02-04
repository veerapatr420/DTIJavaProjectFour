package com.sau.wow;

public class DTISAU {
    //data member ตัวข้อมูล
    String name;
    int Birthyear;
    int age ;
    double high = 100;


    //method member การทำงาน
    public void showHi(){
        System.out.println("Hi...");
    }
    public void calAndshowage(){
        age = 2568 - Birthyear;
        System.out.println("Your age" + age);
    }
}
