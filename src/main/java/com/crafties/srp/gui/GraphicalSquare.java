package com.crafties.srp.gui;

import com.crafties.srp.Square;

public class GraphicalSquare {
    private final Square square;

    public GraphicalSquare(Square square) {
        this.square = square;
    }

    public void drawOn(Screen screen) {
        screen.print("I am a square of " + square.edgeLength() + " cm edge.");
    }
}
