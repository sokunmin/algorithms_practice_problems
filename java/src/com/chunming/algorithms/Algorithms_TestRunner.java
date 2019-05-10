package com.chunming.algorithms;

import com.chunming.Callback;
import com.chunming.TestCase;
import com.chunming.algorithms.dynamic_programming.RodCutting;

public class Algorithms_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new RodCutting());
    }
}
