package br.com.fizzbuzz.matcher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = MatcherBuilder.builder()
            .withDivisorValue(5)
            .withMatchValue("Buzz")
            .build();
    }

    @Test
    public void isDivisorOfFiveReturningBuzz() {
        assertEquals("Buzz", matcher.evaluate(5));
    }

    @Test
    public void isDivisorOfFiveReturningEmpty() {
        assertEquals("", matcher.evaluate(3));
    }

}
