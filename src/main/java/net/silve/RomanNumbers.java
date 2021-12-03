package net.silve;


public class RomanNumbers {

    public static String encode(int i) {
        return "I".repeat(i)
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("VIX", "XIV")
                .replace("VX", "XV")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL");
    }


    private RomanNumbers() {
    }
}
