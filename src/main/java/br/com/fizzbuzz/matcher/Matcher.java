package br.com.fizzbuzz.matcher;

public class Matcher {

    private final int divisor;
    private final String matchValue;

    public Matcher(final int divisor, final String matchValue) {
        this.divisor = divisor;
        this.matchValue = matchValue;
    }

    public String evaluate(final int value) {
        return value % divisor == 0 ? matchValue : "";
    }

}
