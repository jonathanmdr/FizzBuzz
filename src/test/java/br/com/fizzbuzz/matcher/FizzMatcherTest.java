package br.com.fizzbuzz.matcher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = MatcherBuilder.builder()
            .withDivisorValue(3)
            .withMatchValue("Fizz")
            .build();
    }

    @Test
    public void isDivisorOfThreeReturningFizz() {
        assertEquals("Fizz", matcher.evaluate(3));
    }

    @Test
    public void isDivisorOfThreeReturningEmpty() {
        assertEquals("", matcher.evaluate(5));
    }

}
