package br.com.fizzbuzz.service;

import br.com.fizzbuzz.factory.BuzzFactory;
import br.com.fizzbuzz.factory.FizzFactory;
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
        final List<Matcher> matchers = List.of(
            FizzFactory.create(),
            BuzzFactory.create()
        );

        this.fizzBuzzService = new FizzBuzzServiceImpl(matchers);
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
