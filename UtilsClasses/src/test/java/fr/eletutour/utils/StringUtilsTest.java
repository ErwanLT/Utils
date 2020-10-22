package fr.eletutour.utils;

import fr.eletutour.CommonForTest;
import fr.eletutour.utils.strings.StringUtils;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest extends CommonForTest {

    @Test
    public void stringToArrayTest(){
        String[] result = StringUtils.sentenceToArray("Test Test Test");
        assertThat(result.length).isEqualTo(3);
        assertThat(result[0]).isEqualTo("Test");
    }

    @Test
    public void replaceAccentTest(){
        String result = StringUtils.replaceAccent("éàèöôù");
        assertThat(result).isEqualTo("eaeoou");
    }

    @Test
    public void reverseStringTest(){
        String result = StringUtils.reverseString("je s'appelle Groot");
        assertThat(result).isEqualTo("toorG elleppa's ej");
    }

    @Test
    public void isPalindromeTest(){
        boolean result = StringUtils.isPalindrome("abba");
        assertThat(result).isTrue();

        result = StringUtils.isPalindrome("Test");
        assertThat(result).isFalse();
    }
}
