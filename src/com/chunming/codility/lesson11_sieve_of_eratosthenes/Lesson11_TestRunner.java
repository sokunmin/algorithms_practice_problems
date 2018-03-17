package com.chunming.codility.lesson11_sieve_of_eratosthenes;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson11_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new CountSemiprimes());
        TestCase.test(new CountNonDivisible());
    }
}
