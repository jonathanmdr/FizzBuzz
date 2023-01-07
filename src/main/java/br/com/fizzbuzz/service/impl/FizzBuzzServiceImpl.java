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
        final StringBuilder result = new StringBuilder();
        matchers.forEach(matcher -> result.append(matcher.evaluate(value)));
        return (result.length() == 0) ? String.valueOf(value) : result.toString();
    }

}
