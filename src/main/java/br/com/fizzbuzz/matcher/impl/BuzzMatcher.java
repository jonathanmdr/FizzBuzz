package br.com.fizzbuzz.matcher.impl;

import br.com.fizzbuzz.matcher.Matcher;

public class BuzzMatcher implements Matcher {

    private static final int DIVISOR = 5;

    @Override
    public boolean isDivisorOf(int value) {
        return value % DIVISOR == 0;
    }

    @Override
    public String getMatchValue() {
        return "Buzz";
    }

}
