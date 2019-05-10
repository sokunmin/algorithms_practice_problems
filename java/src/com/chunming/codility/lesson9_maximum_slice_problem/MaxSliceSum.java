package com.chunming.codility.lesson9_maximum_slice_problem;

/*
  https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/

  Find a maximum sum of a compact subsequence of array elements.

  Assume that:

  N is an integer within the range [1..1,000,000];
  each element of array A is an integer within the range [−1,000,000..1,000,000];
  the result will be an integer within the range [−2,147,483,648..2,147,483,647].

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;

public class MaxSliceSum implements Callback {

    // contributed by charles_wangkai
    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int number : A) {
            currentSum += number;
            maxSum = Math.max(maxSum, currentSum);
            currentSum = Math.max(0, currentSum);
        }
        return maxSum;
    }

    // contributed by SchlachterSchmidt
    public int solution2(int[] A) {
        System.out.println(Arrays.toString(A));
        long maxSliceSum = Integer.MIN_VALUE;
        long currentSlice = Integer.MIN_VALUE;

        for (int v : A) {
            long currentSum = currentSlice + v;
            System.out.format("[1] curSum: %d + %d => %d\n", currentSlice, v, currentSum);
            currentSlice = Math.max(currentSum, v);
            System.out.format("[2] Max(%d, v:%d) => %d\n", currentSum, v, currentSlice);
            System.out.format("[3] Max(%d, %d) => ", maxSliceSum, currentSlice);
            maxSliceSum = Math.max(maxSliceSum, currentSlice);
            System.out.format("%d\n\n", maxSliceSum);
        }

        return (int) maxSliceSum;
    }

    @Override
    public void test() {
        int[] A = {3, 2, -6, 4, 0};
        int[] B = {-10};
        int[] C = {-2, 1};
        int[] D = {1, -2};
        int[] E = {-2, 1, 1};
        System.out.println("result: " + solution(A) + "\n");
        System.out.println("result: " + solution(B) + "\n");
        System.out.println("result: " + solution(C) + "\n");
        System.out.println("result: " + solution(D) + "\n");
        System.out.println("result: " + solution(E) + "\n");
        System.out.println("-------------------------");
        System.out.println("result: " + solution2(A) + "\n");
        System.out.println("result: " + solution2(B) + "\n");
        System.out.println("result: " + solution2(C) + "\n");
        System.out.println("result: " + solution2(D) + "\n");
        System.out.println("result: " + solution2(E) + "\n");
    }
}
