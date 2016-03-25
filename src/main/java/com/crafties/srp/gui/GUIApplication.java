package com.crafties.srp.gui;

import com.crafties.srp.Square;

public class GUIApplication {

    public static void main(String[] args) {
        GraphicalSquare graphicalSquare = new GraphicalSquare(new Square(100));
        graphicalSquare.drawOn(Screen.console());
    }
}
