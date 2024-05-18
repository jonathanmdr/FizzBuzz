package br.com.fizzbuzz.processor;

import br.com.fizzbuzz.matcher.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzProcessorTest {

    private FizzBuzzProcessor fizzBuzzProcessor;

    @BeforeEach
    void setup() {
        final Matcher fizzMatcher = Matcher.fizz(3);
        final Matcher buzzMatcher = Matcher.buzz(5);

        this.fizzBuzzProcessor = new FizzBuzzProcessor(List.of(fizzMatcher, buzzMatcher));
    }

    @Test
    void processNumberThreeReturningFizz() {
        assertEquals("Fizz", fizzBuzzProcessor.apply(3));
    }

    @Test
    void processNumberFiveReturningBuzz() {
        assertEquals("Buzz", fizzBuzzProcessor.apply(5));
    }

    @Test
    void processNumberSevenReturningSeven() {
        assertEquals("7", fizzBuzzProcessor.apply(7));
    }

    @Test
    void processNumberFifteenReturningFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzProcessor.apply(15));
    }

}
