package ua.ithillel.testing.classwork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathUtilsTest {

    // Given, When, Then
    // Assertions
    // TDD - Test Driven Development
    // Test execution statuses:
    // - Green
    // - Yellow. Test executed successfully but actual result does not equal to expected.
    // - Red. Test executed unsuccessfully and did not reach actual and expected result assertion.
    //
    // False positive
    //
    // Principle: Inversion of Control

    @ParameterizedTest
    @MethodSource("sumOperationArgumentsProvider")
    void shouldSumValues_whenTwoIntegersPassed_soThatRetrievedValue(int a, int b, int expected) {
        Assertions.assertEquals(expected, MathUtils.add(a, b));
    }

    private static Stream<Arguments> sumOperationArgumentsProvider() {
        return Stream.of(
                Arguments.of(10, 10, 20),
                Arguments.of(5, -10, -5),
                Arguments.of(0, 0, 0)
        );
    }

    @ParameterizedTest
    @CsvSource({"10,2,5", "-10,2,-5"})
    void shouldDivideValues_whenTwoIntegersPassed_soThatRetrievedPositiveValue(int a, int b, int expected) {
        Assertions.assertEquals(expected, MathUtils.divide(a, b));
    }

    @Test
    void shouldThrowIllegalArgumentException_whenDividerValuePassedAsZero() {
        Assertions.assertThrowsExactly(IllegalArgumentException.class, () -> MathUtils.divide(0, 0));
    }

}
