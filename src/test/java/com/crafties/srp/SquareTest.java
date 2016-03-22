package com.crafties.srp;

import com.crafties.srp.gui.Screen;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SquareTest {

    @Test
    public void should_print_itself_on_screen() {
        // given
        Square square = new Square(5);
        Screen screen = mock(Screen.class);

        // when
        square.drawOn(screen);

        // then
        verify(screen).print("I am a square of 5 cm edge.");
    }

    @Test
    public void should_compute_area() {
        // given
        Square square = new Square(5);

        // when
        int area = square.area();

        // then
        assertThat(area, is(25));
    }
}