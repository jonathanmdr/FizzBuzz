package br.com.fizzbuzz.matcher;

import br.com.fizzbuzz.matcher.impl.BuzzMatcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class BuzzMatcherTest {

    private Matcher matcher;

    @Before
    public void setup() {
        this.matcher = new BuzzMatcher();
    }

    @Test
    public void isDivisorOfFiveReturningTrue() {
        Assert.assertTrue(matcher.isDivisorOf(5));
    }

    @Test
    public void isDivisorOfFiveReturningFalse() {
        Assert.assertFalse(matcher.isDivisorOf(3));
    }

    @Test
    public void getMatchValueEqualsToBuzz() {
        Assert.assertThat(matcher.getMatchValue(), is("Buzz"));
    }

}
