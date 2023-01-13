package br.com.fizzbuzz.matcher;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class MatcherBuilderTest {

    @Test
    public void givenAnInvalidParameters_whenBuildMatcher_thenThrowsNullPointerException() {
        assertThrows(
            "Match value cannot be null",
            NullPointerException.class,
            MatcherBuilder.builder()::build
        );
    }

    @Test
    public void givenAValidParameters_whenBuildMatcher_thenReturnMatcherInstance() {
        assertNotNull(
            MatcherBuilder.builder()
                .withDivisorValue(1)
                .withMatchValue("Bla")
                .build()
        );
    }

}