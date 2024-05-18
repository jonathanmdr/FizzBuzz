package br.com.fizzbuzz.matcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzMatcherTest {

    private Matcher matcher;

    @BeforeEach
    void setup() {
        this.matcher = Matcher.fizz(3);
    }

    @Test
    void isDivisorOfThreeReturningFizz() {
        assertEquals("Fizz", matcher.apply(3));
    }

    @Test
    void isDivisorOfThreeReturningEmpty() {
        assertEquals("", matcher.apply(5));
    }

}
