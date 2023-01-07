package br.com.fizzbuzz.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FizzFactoryTest {

    @Test
    public void create() {
        assertNotNull(FizzFactory.create());
    }

}