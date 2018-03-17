package com.chunming.codility.lesson14_binary_search_algorithm;

import com.chunming.Callback;
import com.chunming.TestCase;

public class Lesson14_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new MinMaxDivision());
        TestCase.test(new NailingPlanks());
    }
}
