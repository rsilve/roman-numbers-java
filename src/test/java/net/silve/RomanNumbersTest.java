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
    void shouldReturnXIVfor14() {
        String roman = RomanNumbers.encode(14);
        assertEquals("XIV", roman);
    }

    @Test
    void shouldReturnXVfor15() {
        String roman = RomanNumbers.encode(15);
        assertEquals("XV", roman);
    }

    @Test
    void shouldReturnXIXfor19() {
        String roman = RomanNumbers.encode(19);
        assertEquals("XIX", roman);
    }

    @Test
    void shouldReturnXXfor20() {
        String roman = RomanNumbers.encode(20);
        assertEquals("XX", roman);
    }

    @Test
    void shouldReturnLfor50() {
        String roman = RomanNumbers.encode(50);
        assertEquals("L", roman);
    }

    @Test
    void shouldReturnXLfor40() {
        String roman = RomanNumbers.encode(40);
        assertEquals("XL", roman);
    }

    @Test
    void shouldReturnCfor100() {
        String roman = RomanNumbers.encode(100);
        assertEquals("C", roman);
    }

    @Test
    void shouldReturnXCfor90() {
        String roman = RomanNumbers.encode(90);
        assertEquals("XC", roman);
    }


    @Test
    void shouldReturnDfor500() {
        String roman = RomanNumbers.encode(500);
        assertEquals("D", roman);
    }

    @Test
    void shouldReturnDfor400() {
        String roman = RomanNumbers.encode(400);
        assertEquals("CD", roman);
    }

    @Test
    void shouldReturnDfor490() {
        String roman = RomanNumbers.encode(490);
        assertEquals("XD", roman);
    }


    @Test
    void shouldReturnMfor1000() {
        String roman = RomanNumbers.encode(1000);
        assertEquals("M", roman);
    }

    @Test
    void shouldReturnCMfor900() {
        String roman = RomanNumbers.encode(900);
        assertEquals("CM", roman);
    }

    @Test
    void shouldReturnXMfor990() {
        String roman = RomanNumbers.encode(990);
        assertEquals("XM", roman);
    }

}