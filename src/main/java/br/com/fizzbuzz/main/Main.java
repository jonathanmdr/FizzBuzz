package br.com.fizzbuzz.main;

import br.com.fizzbuzz.matcher.MatcherBuilder;
import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.service.FizzBuzzService;
import br.com.fizzbuzz.service.impl.FizzBuzzServiceImpl;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(final String ... args) {
        final Matcher fizzMatcher = MatcherBuilder.builder()
            .withDivisorValue(3)
            .withMatchValue("Fizz")
            .build();

        final Matcher buzzMatcher = MatcherBuilder.builder()
            .withDivisorValue(5)
            .withMatchValue("Buzz")
            .build();

        final FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl(List.of(fizzMatcher, buzzMatcher));

        IntStream.range(1, 101)
            .forEach(value -> System.out.println(fizzBuzzService.process(value)));
    }

}
