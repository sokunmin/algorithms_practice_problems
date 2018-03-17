package com.chunming.codility;

import com.chunming.Callback;
import com.chunming.TestCase;
import com.chunming.codility.lesson10_prime_and_composite_numbers.Lesson10_TestRunner;
import com.chunming.codility.lesson11_sieve_of_eratosthenes.Lesson11_TestRunner;
import com.chunming.codility.lesson12_euclidean_algorithm.Lesson12_TestRunner;
import com.chunming.codility.lesson13_fibonacci_numbers.Lesson13_TestRunner;
import com.chunming.codility.lesson14_binary_search_algorithm.Lesson14_TestRunner;
import com.chunming.codility.lesson15_caterpillar_method.Lesson15_TestRunner;
import com.chunming.codility.lesson16_greedy_algorithms.Lesson16_TestRunner;
import com.chunming.codility.lesson17_dynamic_programming.Lesson17_TestRunner;
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
        TestCase.test(new Lesson10_TestRunner());
        TestCase.test(new Lesson11_TestRunner());
        TestCase.test(new Lesson12_TestRunner());
        TestCase.test(new Lesson13_TestRunner());
        TestCase.test(new Lesson14_TestRunner());
        TestCase.test(new Lesson15_TestRunner());
        TestCase.test(new Lesson16_TestRunner());
        TestCase.test(new Lesson17_TestRunner());
    }
}
