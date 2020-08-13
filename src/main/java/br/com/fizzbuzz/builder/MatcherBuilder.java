package br.com.fizzbuzz.builder;

import br.com.fizzbuzz.matcher.Matcher;
import br.com.fizzbuzz.matcher.impl.BuzzMatcher;
import br.com.fizzbuzz.matcher.impl.FizzMatcher;

import java.util.LinkedList;
import java.util.List;

public class MatcherBuilder {

    private MatcherBuilder() {
        throw new IllegalStateException("This is utility class");
    }

    public static List<Matcher> getMatchers() {
        List<Matcher> matchers = new LinkedList<>();
        matchers.add(new FizzMatcher());
        matchers.add(new BuzzMatcher());
        return matchers;
    }

}
