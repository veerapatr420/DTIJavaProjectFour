package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        //การใช้งาน object/instance คือ การใช้งาน data anf method
        //การใช้งาน data คือ การกำหนดค่าให้ใหม่ หรือ เอาค่ามาใช้
        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);
        //การใช้งาน method คือ การสั่งให้ method นั้นๆ ทำงาน
        ob1.showA();
        ob2.showA();
        ob2.show();
    }
}
