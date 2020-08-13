package br.com.fizzbuzz.main;

import br.com.fizzbuzz.builder.MatcherBuilder;
import br.com.fizzbuzz.service.FizzBuzzService;
import br.com.fizzbuzz.service.impl.FizzBuzzServiceImpl;

public class Main {

    public static void main(String ... args) {
        FizzBuzzService fizzBuzzService = new FizzBuzzServiceImpl(MatcherBuilder.getMatchers());

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzService.processNumber(i));
        }

    }

}
