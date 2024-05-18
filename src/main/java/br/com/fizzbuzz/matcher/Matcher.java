package br.com.fizzbuzz.matcher;

import java.util.function.IntFunction;

public record Matcher(
    int divisor,
    String matchValue
) implements IntFunction<String> {

    public static Matcher fizz(final int divisor) {
        return new Matcher(divisor, "Fizz");
    }

    public static Matcher buzz(final int divisor) {
        return new Matcher(divisor, "Buzz");
    }

    @Override
    public String apply(final int value) {
        return value % this.divisor == 0 ? this.matchValue : "";
    }

}
