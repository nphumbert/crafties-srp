package com.crafties.srp;

import com.crafties.srp.gui.Screen;

public class Square {

    private final int edgeLength;

    public Square(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public void drawOn(Screen screen) {
        screen.print("I am a square of " + edgeLength + " cm edge.");
    }

    public int area() {
        return edgeLength * edgeLength;
    }
}
