package br.com.fizzbuzz.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class BuzzFactoryTest {

    @Test
    public void testCreate() {
        assertNotNull(BuzzFactory.create());
    }

}