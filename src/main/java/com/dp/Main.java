package com.dp;

public class Main {

    public static void main (String[] args) {
        // object creation without builder pattern

        Phone phone1 = new Phone("Android", "3GB", "3000MAH");
        System.out.println(phone1);

        // object creation using builder pattern
        Phone phone2 = new PhoneBuilder().setOs("Android").setBattery("4000MAH").setRam("4GB").getPhone();
        System.out.println(phone2);
    }

}
