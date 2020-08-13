package br.com.fizzbuzz.service;

import br.com.fizzbuzz.builder.MatcherBuilder;
import br.com.fizzbuzz.service.impl.FizzBuzzServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class FizzBuzzServiceImplTest {

    private FizzBuzzService fizzBuzzService;

    @Before
    public void setup() {
        this.fizzBuzzService = new FizzBuzzServiceImpl(MatcherBuilder.getMatchers());
    }

    @Test
    public void processNumberThreeReturningFizz() {
        Assert.assertThat(fizzBuzzService.processNumber(3), is("Fizz"));
    }

    @Test
    public void processNumberFiveReturningBuzz() {
        Assert.assertThat(fizzBuzzService.processNumber(5), is("Buzz"));
    }

    @Test
    public void processNumberSevenReturningSeven() {
        Assert.assertThat(fizzBuzzService.processNumber(7), is("7"));
    }

    @Test
    public void processNumberFifteenReturningFizzBuzz() {
        Assert.assertThat(fizzBuzzService.processNumber(15), is("FizzBuzz"));
    }

}
