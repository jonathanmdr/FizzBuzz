package br.com.fizzbuzz.matcher;

import br.com.fizzbuzz.matcher.impl.FizzMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = new FizzMatcher();
    }

    @Test
    public void isDivisorOfThreeReturningTrue() {
        Assert.assertTrue(matcher.isDivisorOf(3));
    }

    @Test
    public void isDivisorOfThreeReturningFalse() {
        Assert.assertFalse(matcher.isDivisorOf(5));
    }

    @Test
    public void getMatchValueEqualsToFizz() {
        Assert.assertThat(matcher.getMatchValue(), is("Fizz"));
    }

}
