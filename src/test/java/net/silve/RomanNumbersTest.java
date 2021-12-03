package net.silve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    void shouldReturnIfor1() {
        String roman = RomanNumbers.encode(1);
        assertEquals("I", roman);
    }

}