package br.com.fizzbuzz.service.impl;

import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.service.FizzBuzzService;

import java.util.List;

public class FizzBuzzServiceImpl implements FizzBuzzService {

    private final List<Matcher> matchers;

    public FizzBuzzServiceImpl(List<Matcher> matchers) {
        this.matchers = matchers;
    }

    @Override
    public String processNumber(int value) {
        String result = "";

        for (Matcher matcher : matchers) {
            if (matcher.isDivisorOf(value)) {
                result += matcher.getMatchValue();
            }
        }

        return result.isEmpty() ? String.valueOf(value) : result;
    }

}
