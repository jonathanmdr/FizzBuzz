package br.com.fizzbuzz.factory;

import br.com.fizzbuzz.matcher.Matcher;

public final class BuzzFactory {

    private static final String BUZZ_MATCH_VALUE = "Buzz";
    private static final int BUZZ_DIVISOR_VALUE = 5;

    private BuzzFactory() {
        throw new IllegalStateException("This is utility class");
    }

    public static Matcher create() {
        return new Matcher(BUZZ_DIVISOR_VALUE, BUZZ_MATCH_VALUE);
    }

}
