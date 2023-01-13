package br.com.fizzbuzz.service;

import br.com.fizzbuzz.matcher.MatcherBuilder;
import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.service.impl.FizzBuzzServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzServiceImplTest {

    private FizzBuzzService fizzBuzzService;

    @Before
    public void setup() {
        final Matcher fizzMatcher = MatcherBuilder.builder()
            .withDivisorValue(3)
            .withMatchValue("Fizz")
            .build();

        final Matcher buzzMatcher = MatcherBuilder.builder()
            .withDivisorValue(5)
            .withMatchValue("Buzz")
            .build();

        this.fizzBuzzService = new FizzBuzzServiceImpl(List.of(fizzMatcher, buzzMatcher));
    }

    @Test
    public void processNumberThreeReturningFizz() {
        assertEquals("Fizz", fizzBuzzService.process(3));
    }

    @Test
    public void processNumberFiveReturningBuzz() {
        assertEquals("Buzz", fizzBuzzService.process(5));
    }

    @Test
    public void processNumberSevenReturningSeven() {
        assertEquals("7", fizzBuzzService.process(7));
    }

    @Test
    public void processNumberFifteenReturningFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzService.process(15));
    }

}
