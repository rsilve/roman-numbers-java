package net.silve;


public class RomanNumbers {

    public static String encode(int i) {
        return "I".repeat(i)
                .replace("IIII", "IV")
                .replace("IVI", "V")
                .replace("VVI", "IX")
                .replace("IXI", "X")
                .replace("VIX", "XIV");
    }


    private RomanNumbers() {
    }
}
