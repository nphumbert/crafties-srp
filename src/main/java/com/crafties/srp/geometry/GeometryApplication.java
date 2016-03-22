package com.crafties.srp.geometry;

import com.crafties.srp.Square;

public class GeometryApplication {

    public static void main(String[] args) {
        Square square = new Square(100);
        int area = square.area();
        System.out.println("Area of a 100 cm edge square: " + area + " cm²");
    }

}
