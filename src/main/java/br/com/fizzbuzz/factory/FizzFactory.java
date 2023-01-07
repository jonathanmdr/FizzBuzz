package br.com.fizzbuzz.factory;

import br.com.fizzbuzz.matcher.Matcher;

public final class FizzFactory {

    private static final String FIZZ_MATCH_VALUE = "Fizz";
    private static final int FIZZ_DIVISOR_VALUE = 3;

    private FizzFactory() {
        throw new IllegalStateException("This is utility class");
    }

    public static Matcher create() {
        return new Matcher(FIZZ_DIVISOR_VALUE, FIZZ_MATCH_VALUE);
    }

}
