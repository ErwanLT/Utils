package fr.eletutour.utils;

import fr.eletutour.utils.numbers.NumberUtils;
import org.assertj.core.data.Percentage;
import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberUtilsTest {

    @Test
    public void getFibonacciToLimitTest(){
        List<Integer> fibonacci = NumberUtils.getFibonacciToLimit(4);
        assertThat(fibonacci).isNotNull().isNotEmpty().hasSize(5);
        assertThat(fibonacci.get(0)).isEqualTo(0);
        assertThat(fibonacci.get(1)).isEqualTo(1);
        assertThat(fibonacci.get(2)).isEqualTo(1);
        assertThat(fibonacci.get(3)).isEqualTo(2);
        assertThat(fibonacci.get(4)).isEqualTo(3);
    }

    @Test
    public void toBinaryStringTest(){
        assertThat(NumberUtils.toBinaryString(111)).isEqualTo("1101111");
    }

    @Test
    public void fromBinaryStringToIntegerTest(){
        assertThat(NumberUtils.fromBinaryStringToInteger("1101111")).isEqualTo(111);
    }

    @Test
    public void toHexadecimalString(){
        assertThat(NumberUtils.toHexadecimalString(111)).isEqualTo("6f");
    }

    @Test
    public void fromHexadecimalStringToIntegerTest(){
        assertThat(NumberUtils.fromHexadecimalStringToInteger("6f")).isEqualTo(111);
    }

    @Test
    public void getSquaredNumberTest(){
        assertThat(NumberUtils.getSquaredNumber(2)).isEqualTo(4);
    }

    @Test
    public void getPiTest(){
        assertThat(NumberUtils.getPI()).isNotNull().isCloseTo(3.14, Percentage.withPercentage(0.25));
    }

}
