package br.com.fizzbuzz.processor;

import br.com.fizzbuzz.matcher.Matcher;

import java.util.List;
import java.util.function.IntFunction;

public class FizzBuzzProcessor implements IntFunction<String> {

    private final List<Matcher> matchers;

    public FizzBuzzProcessor(final List<Matcher> matchers) {
        this.matchers = matchers;
    }

    @Override
    public String apply(final int value) {
        return matchers.stream()
            .map(matcher -> matcher.apply(value))
            .reduce("", String::concat)
            .transform(result -> result.isEmpty() ? String.valueOf(value) : result);
    }

}
