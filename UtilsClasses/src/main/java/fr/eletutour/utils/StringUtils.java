package fr.eletutour.utils;

import java.text.Normalizer;

/**
 * Classe utilitaire pour les String
 *
 * @author ewanletutour
 * @since v1.0
 */
public class StringUtils {

    /**
     * methode to transform a sentence to an array of word
     * @param str the sentence to transform
     * @return an array of {@link String}
     */
    public static String[] sentenceToArray(String str) {
        return str.split(" ");
    }


    /**
     * methode to replace all accentued character of a String by non accentued
     * @param input the input string
     * @return a {@link String} without accent
     */
    public static String replaceAccent(String input) {
        StringBuilder sb = new StringBuilder(input.length());
        input = Normalizer.normalize(input, Normalizer.Form.NFD);
        for (char c : input.toCharArray()) {
            if (c <= '\u007F') sb.append(c);
        }
        return sb.toString();
    }

    /**
     * methode to reverse the order of all character in a string
     * @param input the input string
     * @return a {@link String}
     */
    public static String reverseString(String input) {
        return new StringBuilder().append(input).reverse().toString();
    }

    /**
     * methode to check if a {@link String} is a plindrome
     * @param input the input string
     * @return
     * <ul>
     *     <li>true if the input is a palindrome</li>
     *     <li>false if the input is not a palindrome</li>
     * </ul>
     */
    public static boolean isPalindrome(String input) {
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
