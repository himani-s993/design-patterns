package com.dp;

public class Main {

    public static void main (String[] args) {
        System.out.println("Hi");
        PoylgonHelper helper = new PoylgonHelper();
        Shape polygon =  helper.createPolygon(3);
        polygon.draw();
    }

}
