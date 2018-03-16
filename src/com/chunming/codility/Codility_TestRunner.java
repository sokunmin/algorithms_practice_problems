package com.chunming.codility;

import com.chunming.Callback;
import com.chunming.TestCase;
import com.chunming.codility.lesson1_iterations.Lesson1_TestRunner;
import com.chunming.codility.lesson2_arrays.Lesson2_TestRunner;
import com.chunming.codility.lesson3_time_complexity.Lesson3_TestRunner;
import com.chunming.codility.lesson4_counting_elements.Lesson4_TestRunner;
import com.chunming.codility.lesson5_prefix_sums.Lesson5_TestRunner;
import com.chunming.codility.lesson6_sorting.Lesson6_TestRunner;
import com.chunming.codility.lesson7_stacks_and_queues.Lesson7_TestRunner;
import com.chunming.codility.lesson8_leader.Lesson8_TestRunner;
import com.chunming.codility.lesson9_maximum_slice_problem.Lesson9_TestRunner;

public class Codility_TestRunner implements Callback {
    @Override
    public void test() {
        TestCase.test(new Lesson1_TestRunner());
        TestCase.test(new Lesson2_TestRunner());
        TestCase.test(new Lesson3_TestRunner());
        TestCase.test(new Lesson4_TestRunner());
        TestCase.test(new Lesson5_TestRunner());
        TestCase.test(new Lesson6_TestRunner());
        TestCase.test(new Lesson7_TestRunner());
        TestCase.test(new Lesson8_TestRunner());
        TestCase.test(new Lesson9_TestRunner());
    }
}
