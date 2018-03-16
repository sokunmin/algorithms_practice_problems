package com.chunming.codility.lesson3_time_complexity;

/*
  https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/

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

public class TapeEquilibrium implements Callback {

    public int solution(int[] A) {
        // the performance of this line is not good enough.
        // int sum = IntStream.of(A).sum();
        int sum = 0;
        for (int v : A) {
            sum += v;
        }

        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        for (int i = 0; i < A.length-1; i++) {
            System.out.format("[%d] %d\n", i, A[i]);
            leftSum += A[i];
            int rightSum = (sum - leftSum);
            minDiff = Math.min(Math.abs(leftSum - rightSum), minDiff);
        }
        return minDiff;
    }

    @Override
    public void test() {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));

        int[] B = {0, 1, 2, 4, 0, 0, 0};
        System.out.println(solution(B));
    }
}
