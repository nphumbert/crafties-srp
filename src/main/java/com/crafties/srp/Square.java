package com.crafties.srp;

public class Square {

    private final int edgeLength;

    public Square(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int area() {
        return edgeLength * edgeLength;
    }

    public int edgeLength() {
        return edgeLength;
    }
}
