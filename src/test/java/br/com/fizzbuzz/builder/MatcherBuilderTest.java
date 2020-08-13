package br.com.fizzbuzz.builder;

import br.com.fizzbuzz.matcher.impl.BuzzMatcher;
import br.com.fizzbuzz.matcher.impl.FizzMatcher;
import org.junit.Assert;
import org.junit.Test;

public class MatcherBuilderTest {

    @Test
    public void firstMatcherEqualsToFizzMatcher() {
        int FIRST_POSITION = 0;
        Assert.assertTrue(MatcherBuilder.getMatchers().get(FIRST_POSITION) instanceof FizzMatcher);
    }

    @Test
    public void secondMatcherEqualsToBuzzMatcher() {
        int SECOND_POSITION = 1;
        Assert.assertTrue(MatcherBuilder.getMatchers().get(SECOND_POSITION) instanceof BuzzMatcher);
    }

    @Test
    public void sizeMatcherListEqualsToTwo() {
        Assert.assertTrue(MatcherBuilder.getMatchers().size() == 2);
    }

}
