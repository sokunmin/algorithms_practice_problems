package com.chunming.codility.lesson2_arrays;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson2_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new CyclicRotation());
        TestCase.test(new OddOccurrencesInArray());
    }
}
