package fr.eletutour.utils.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    /**
     * Methode to generate a list of integer in fibonnaci order up to a limit
     * @param limit the limit
     * @return a list of {@link Integer}
     */
    public static List<Integer> getFibonacciToLimit(int limit){
        int t1 = 0;
        int t2 = 1;
        List<Integer> fibonacci = new ArrayList<>();
        while (t1 <= limit)
        {
            fibonacci.add(t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        return fibonacci;
    }

    public static String toBinaryString(int input){
        return Integer.toBinaryString(input);
    }

    public static String toHexadecimalString(int input){
        return Integer.toHexString(input);
    }

    public static int fromBinaryStringToInteger(String s) {
        return Integer.parseInt(s, 2);
    }

    public static int fromHexadecimalStringToInteger(String s) {
        return Integer.parseInt(s, 16);
    }

    public static int getSquaredNumber(int input){
        return input * input;
    }

    public static double getPI() {
        return Math.PI;
    }
}
