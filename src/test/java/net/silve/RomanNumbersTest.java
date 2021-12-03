package net.silve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersTest {

    @Test
    void shouldReturnIfor1() {
        String roman = RomanNumbers.encode(1);
        assertEquals("I", roman);
    }

    @Test
    void shouldReturnIIfor2() {
        String roman = RomanNumbers.encode(2);
        assertEquals("II", roman);
    }

    @Test
    void shouldReturnIVfor4() {
        String roman = RomanNumbers.encode(4);
        assertEquals("IV", roman);
    }

    @Test
    void shouldReturnVfor5() {
        String roman = RomanNumbers.encode(5);
        assertEquals("V", roman);
    }

}