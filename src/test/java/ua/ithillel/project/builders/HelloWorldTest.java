package ua.ithillel.project.builders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void shouldReturnConcatenatedGreetingMessage_whenNamePassed() {
        Assertions.assertEquals("My name is Test", new HelloWorld().greetingMessage("Test"));
    }

}