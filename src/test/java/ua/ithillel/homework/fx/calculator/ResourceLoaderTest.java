package ua.ithillel.homework.fx.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchRuntimeException;

class ResourceLoaderTest {

    /*
    Given - prerequisites
    When - act
    Then - assertion

    Fluent API
     */

    @Test
    void shouldRetrieveResource_thatMustContainFxRatesData_butNotEmpty() {
        assertThat(new ResourceLoader().load()).isNotEmpty();
    }

    @Test
    void shouldRetrieveResource_thatMustContainFxRatesData_butEmpty() {
        assertThat(new ResourceLoader().load()).isEmpty();
    }

    @Test
    void shouldThrowRuntimeException_whenResourceWithFxRatesNotFound() {
        assertThat(
                catchRuntimeException(() -> new ResourceLoader().load())
        )
                .isNotNull();
    }

}