package br.com.fizzbuzz.main;

import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.processor.FizzBuzzProcessor;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(final String ... args) {
        final Matcher fizzMatcher = Matcher.fizz(3);
        final Matcher buzzMatcher = Matcher.buzz(5);
        final FizzBuzzProcessor fizzBuzzProcessor = new FizzBuzzProcessor(List.of(fizzMatcher, buzzMatcher));

        IntStream.range(1, 101)
            .mapToObj(fizzBuzzProcessor)
            .forEach(System.out::println);
    }

}
