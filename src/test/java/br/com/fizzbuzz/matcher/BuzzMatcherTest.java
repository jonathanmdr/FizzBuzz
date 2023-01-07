package br.com.fizzbuzz.matcher;

import br.com.fizzbuzz.factory.BuzzFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = BuzzFactory.create();
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
