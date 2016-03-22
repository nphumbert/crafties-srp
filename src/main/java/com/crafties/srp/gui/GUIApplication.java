package com.crafties.srp.gui;

import com.crafties.srp.Square;

public class GUIApplication {

    public static void main(String[] args) {
        Square square = new Square(100);
        square.drawOn(Screen.console());
    }
}
