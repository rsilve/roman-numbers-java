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
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("CDXC", "XD")
                .replace("DD", "M")
                .replace("DCD", "CM")
                .replace("DXD", "XM")
                .replace("CML", "LM")
                ;
    }


    private RomanNumbers() {
    }
}
