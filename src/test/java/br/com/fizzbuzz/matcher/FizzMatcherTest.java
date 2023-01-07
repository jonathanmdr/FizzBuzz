package br.com.fizzbuzz.matcher;

import br.com.fizzbuzz.factory.FizzFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = FizzFactory.create();
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
