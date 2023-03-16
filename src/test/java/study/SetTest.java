package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void step1() {

        assertThat(numbers).hasSize(3);

    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(final int number) {
        assertThat(numbers.contains(number)).isTrue();
    }


    // Test Case 구현
}