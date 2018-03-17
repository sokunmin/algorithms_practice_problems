package com.chunming.codility.lesson10_prime_and_composite_numbers;

import com.chunming.Callback;
import com.chunming.TestCase;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxDoubleSliceSum;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxProfit;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxSliceSum;

public class Lesson10_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new CountFactors());
        TestCase.test(new MinPerimeterRectangle());
        TestCase.test(new Flags());
        TestCase.test(new Peaks());
    }
}
