package com.chunming.codility.lesson12_euclidean_algorithm;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson12_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new ChocolatesByNumbers());
        TestCase.test(new CommonPrimeDivisors());
    }
}
