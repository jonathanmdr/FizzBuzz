package br.com.fizzbuzz.matcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuzzMatcherTest {

    private Matcher matcher;

    @BeforeEach
    void setup() {
        this.matcher = Matcher.buzz(5);
    }

    @Test
    void isDivisorOfFiveReturningBuzz() {
        assertEquals("Buzz", matcher.apply(5));
    }

    @Test
    void isDivisorOfFiveReturningEmpty() {
        assertEquals("", matcher.apply(3));
    }

}
