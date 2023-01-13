package br.com.fizzbuzz.matcher;

import java.util.Objects;

public final class MatcherBuilder {

    private int divisorValue;
    private String matchValue;

    private MatcherBuilder() { }

    public static MatcherBuilder builder() {
        return new MatcherBuilder();
    }

    public MatcherBuilder withDivisorValue(final int divisorValue) {
        this.divisorValue = divisorValue;
        return this;
    }

    public MatcherBuilder withMatchValue(final String matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    public Matcher build() {
        Objects.requireNonNull(this.matchValue, "Match value cannot be null");
        return new Matcher(this.divisorValue, this.matchValue);
    }

}
