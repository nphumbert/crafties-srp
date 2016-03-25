package com.crafties.srp.gui;

import com.crafties.srp.Square;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GraphicalSquareTest {

    @Test
    public void should_draw_square_on_screen() {
        // given
        GraphicalSquare graphicalSquare = new GraphicalSquare(new Square(5));
        Screen screen = mock(Screen.class);

        // when
        graphicalSquare.drawOn(screen);

        // then
        verify(screen).print("I am a square of 5 cm edge.");
    }

}