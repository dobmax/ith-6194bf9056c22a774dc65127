package ua.ithillel.chat.application.security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchRuntimeException;

class CredentialUtilsTest {

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"-u=<username> -p=<password>", "-log-in -u=<username> -p=<password>", "login -u=<username> -p=<password>"})
    void shouldThrowRuntimeException_whenCredentialLineDoesNotStartWithLoginCommand(String invalidCredentialLine) {
        assertThat(
                catchRuntimeException(() -> CredentialUtils.parse(invalidCredentialLine))
        )
                .isNotNull();
    }

    @Test
    void shouldRetrieveParsedUserCredentials_asArrayContainingFirstValueAsUsername_andSecondValueAsPassword() {
        assertThat(CredentialUtils.parse("-login -u=username -p=password"))
                .isNotEmpty()
                .containsExactly("username", "password");
    }

}