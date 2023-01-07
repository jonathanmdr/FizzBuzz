package br.com.fizzbuzz.main;

import br.com.fizzbuzz.factory.BuzzFactory;
import br.com.fizzbuzz.factory.FizzFactory;
import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.service.FizzBuzzService;
import br.com.fizzbuzz.service.impl.FizzBuzzServiceImpl;

import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(final String ... args) {
        final List<Matcher> matchers = List.of(
            FizzFactory.create(),
            BuzzFactory.create()
        );

        final FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl(matchers);

        IntStream.range(1, 101)
            .forEach(value -> System.out.println(fizzBuzzService.process(value)));
    }

}
