package fr.eletutour.utils;

import fr.eletutour.utils.numbers.NumberUtils;
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
}
