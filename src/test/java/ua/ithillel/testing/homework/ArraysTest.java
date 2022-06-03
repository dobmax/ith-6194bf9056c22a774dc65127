package ua.ithillel.testing.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

class ArraysTest {

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowRuntimeException_whenNoFourFound(int[] emptyValues) {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> Arrays.method1(emptyValues));
    }

    @Test
    void shouldThrowRuntimeException_whenNoFourFound() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> Arrays.method1(new int[] {1, 2, 3}));
    }

    @ParameterizedTest
    @MethodSource("expectedArrayProvider")
    void shouldRetrieveArrayPart_afterLatestFourValueFound(int[] input, int[] expected) {
        Assertions.assertArrayEquals(expected, Arrays.method1(input));
    }

    private static Stream<Arguments> expectedArrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[0]),
                Arguments.of(new int[]{1, 2, 3, 4, 1, 2, 3}, new int[] {1, 2, 3}),
                Arguments.of(new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7}, new int[] {5, 6, 7})
        );
    }


}