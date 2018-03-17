package com.chunming.codility;

import com.chunming.Callback;
import com.chunming.TestCase;
import com.chunming.codility.lesson10_prime_and_composite_numbers.CountFactors;
import com.chunming.codility.lesson10_prime_and_composite_numbers.Flags;
import com.chunming.codility.lesson10_prime_and_composite_numbers.MinPerimeterRectangle;
import com.chunming.codility.lesson10_prime_and_composite_numbers.Peaks;
import com.chunming.codility.lesson11_sieve_of_eratosthenes.CountNonDivisible;
import com.chunming.codility.lesson11_sieve_of_eratosthenes.CountSemiprimes;
import com.chunming.codility.lesson12_euclidean_algorithm.ChocolatesByNumbers;
import com.chunming.codility.lesson12_euclidean_algorithm.CommonPrimeDivisors;
import com.chunming.codility.lesson13_fibonacci_numbers.FibFrog;
import com.chunming.codility.lesson13_fibonacci_numbers.Ladder;
import com.chunming.codility.lesson14_binary_search_algorithm.MinMaxDivision;
import com.chunming.codility.lesson14_binary_search_algorithm.NailingPlanks;
import com.chunming.codility.lesson15_caterpillar_method.AbsDistinct;
import com.chunming.codility.lesson15_caterpillar_method.CountDistinctSlices;
import com.chunming.codility.lesson15_caterpillar_method.CountTriangles;
import com.chunming.codility.lesson15_caterpillar_method.MinAbsSumOfTwo;
import com.chunming.codility.lesson16_greedy_algorithms.MaxNonoverlappingSegments;
import com.chunming.codility.lesson16_greedy_algorithms.TieRopes;
import com.chunming.codility.lesson17_dynamic_programming.MinAbsSum;
import com.chunming.codility.lesson17_dynamic_programming.NumberSolitaire;
import com.chunming.codility.lesson1_iterations.BinaryGap;
import com.chunming.codility.lesson2_arrays.CyclicRotation;
import com.chunming.codility.lesson2_arrays.OddOccurrencesInArray;
import com.chunming.codility.lesson3_time_complexity.FrogJmp;
import com.chunming.codility.lesson3_time_complexity.PermMissingElem;
import com.chunming.codility.lesson3_time_complexity.TapeEquilibrium;
import com.chunming.codility.lesson4_counting_elements.FrogRiverOne;
import com.chunming.codility.lesson4_counting_elements.MaxCounters;
import com.chunming.codility.lesson4_counting_elements.MissingInteger;
import com.chunming.codility.lesson4_counting_elements.PermCheck;
import com.chunming.codility.lesson5_prefix_sums.CountDiv;
import com.chunming.codility.lesson5_prefix_sums.GenomicRangeQuery;
import com.chunming.codility.lesson5_prefix_sums.MinAvgTwoSlice;
import com.chunming.codility.lesson5_prefix_sums.PassingCars;
import com.chunming.codility.lesson6_sorting.Distinct;
import com.chunming.codility.lesson6_sorting.MaxProductOfThree;
import com.chunming.codility.lesson6_sorting.Triangle;
import com.chunming.codility.lesson7_stacks_and_queues.Brackets;
import com.chunming.codility.lesson7_stacks_and_queues.Fish;
import com.chunming.codility.lesson7_stacks_and_queues.Nesting;
import com.chunming.codility.lesson7_stacks_and_queues.StoneWall;
import com.chunming.codility.lesson8_leader.Dominator;
import com.chunming.codility.lesson8_leader.EquiLeader;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxDoubleSliceSum;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxProfit;
import com.chunming.codility.lesson9_maximum_slice_problem.MaxSliceSum;

public class Codility_TestRunner implements Callback {
    @Override
    public void test() {

        lesson1();
        lesson2();
        lesson3();
        lesson4();
        lesson5();
        lesson6();
        lesson7();
        lesson8();
        lesson9();
        lesson10();
        lesson11();
        lesson12();
        lesson13();
        lesson14();
        lesson15();
        lesson16();
        lesson17();
    }

    public static void lesson1() {
        // Lesson 1
        TestCase.test(new BinaryGap());
    }

    public static void lesson2() {
        // Lesson 2
        TestCase.test(new CyclicRotation());
        TestCase.test(new OddOccurrencesInArray());
    }

    public static void lesson3() {
        // Lesson 3
        TestCase.test(new TapeEquilibrium());
        TestCase.test(new FrogJmp());
        TestCase.test(new PermMissingElem());
    }

    public static void lesson4() {
        // Lesson 4
        TestCase.test(new FrogRiverOne());
        TestCase.test(new MissingInteger());
        TestCase.test(new PermCheck());
        TestCase.test(new MaxCounters());
    }

    public static void lesson5() {
        // Lesson 5
        TestCase.test(new CountDiv());
        TestCase.test(new PassingCars());
        TestCase.test(new GenomicRangeQuery());
        TestCase.test(new MinAvgTwoSlice());
    }

    public static void lesson6() {
        // Lesson 6
        TestCase.test(new Triangle());
        TestCase.test(new Distinct());
        TestCase.test(new MaxProductOfThree());

    }

    public static void lesson7() {
        // Lesson 7
        TestCase.test(new StoneWall());
        TestCase.test(new Brackets());
        TestCase.test(new Fish());
        TestCase.test(new Nesting());
    }

    public static void lesson8() {
        // Lesson 8
        TestCase.test(new Dominator());
        TestCase.test(new EquiLeader());
    }

    public static void lesson9() {
        // Lesson 9
        TestCase.test(new MaxDoubleSliceSum());
        TestCase.test(new MaxProfit());
        TestCase.test(new MaxSliceSum());
    }

    public static void lesson10() {
        // Lesson 10
        TestCase.test(new CountFactors());
        TestCase.test(new MinPerimeterRectangle());
        TestCase.test(new Flags());
        TestCase.test(new Peaks());
    }

    public static void lesson11() {
        // Lesson 11
        TestCase.test(new CountSemiprimes());
        TestCase.test(new CountNonDivisible());
    }

    public static void lesson12() {
        // Lesson 12
        TestCase.test(new ChocolatesByNumbers());
        TestCase.test(new CommonPrimeDivisors());
    }

    public static void lesson13() {
        // Lesson 13
        TestCase.test(new FibFrog());
        TestCase.test(new Ladder());
    }

    public static void lesson14() {
        // Lesson 14
        TestCase.test(new MinMaxDivision());
        TestCase.test(new NailingPlanks());
    }

    public static void lesson15() {
        // Lesson 15
        TestCase.test(new AbsDistinct());
        TestCase.test(new CountDistinctSlices());
        TestCase.test(new CountTriangles());
        TestCase.test(new MinAbsSumOfTwo());
    }

    public static void lesson16() {
        // Lesson 16
        TestCase.test(new MaxNonoverlappingSegments());
        TestCase.test(new TieRopes());
    }

    public static void lesson17() {
        // Lesson 17
        TestCase.test(new NumberSolitaire());
        TestCase.test(new MinAbsSum());
    }
}
