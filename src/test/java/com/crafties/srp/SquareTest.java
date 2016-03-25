package com.crafties.srp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

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