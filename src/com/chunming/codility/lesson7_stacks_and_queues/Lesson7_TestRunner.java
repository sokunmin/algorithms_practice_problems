package com.chunming.codility.lesson7_stacks_and_queues;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson7_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new StoneWall());
        TestCase.test(new Brackets());
        TestCase.test(new Fish());
        TestCase.test(new Nesting());
    }
}
