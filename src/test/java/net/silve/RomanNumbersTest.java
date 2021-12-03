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

    @Test
    void shouldReturnVIfor6() {
        String roman = RomanNumbers.encode(6);
        assertEquals("VI", roman);
    }

    @Test
    void shouldReturnIXfor9() {
        String roman = RomanNumbers.encode(9);
        assertEquals("IX", roman);
    }

    @Test
    void shouldReturnXfor10() {
        String roman = RomanNumbers.encode(10);
        assertEquals("X", roman);
    }

    @Test
    void shouldReturnXIfor11() {
        String roman = RomanNumbers.encode(11);
        assertEquals("XI", roman);
    }

    @Test
    void shouldReturnXVfor14() {
        String roman = RomanNumbers.encode(14);
        assertEquals("XIV", roman);
    }

}