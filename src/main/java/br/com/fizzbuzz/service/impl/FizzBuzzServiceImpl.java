package br.com.fizzbuzz.service.impl;

import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.service.FizzBuzzService;

import java.util.List;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    private final List<Matcher> matchers;

    public FizzBuzzServiceImpl(final List<Matcher> matchers) {
        this.matchers = matchers;
    }

    @Override
    public String process(int value) {
        final String result = matchers.stream()
            .map(matcher -> matcher.evaluate(value))
            .reduce("", String::concat);

        return result.length() == 0 ? String.valueOf(value) : result;
    }

}
