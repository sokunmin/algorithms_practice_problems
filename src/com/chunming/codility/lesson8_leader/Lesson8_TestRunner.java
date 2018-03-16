package com.chunming.codility.lesson8_leader;

import com.chunming.TestCase;
import com.chunming.Callback;

public class Lesson8_TestRunner implements Callback {

    @Override
    public void test() {
        TestCase.test(new Dominator());
        TestCase.test(new EquiLeader());
    }
}
