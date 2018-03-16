package com.chunming.codility.lesson5_prefix_sums;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson5_TestRunner implements Callback {

    @Override
    public void test() {
//        TestCase.test(new CountDiv());
//        TestCase.test(new PassingCars());
        TestCase.test(new GenomicRangeQuery());
        TestCase.test(new MinAvgTwoSlice());
    }
}
