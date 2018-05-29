package com.dp;

public class PoylgonHelper {

    public Shape createPolygon(int numberOfCorner) {
        if (numberOfCorner == 3 ) {
            return new Triangle();
        }

        if (numberOfCorner == 4) {
            return new Rectangle();
        }

        return null;
    }
}
