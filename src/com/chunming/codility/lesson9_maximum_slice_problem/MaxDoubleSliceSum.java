package com.chunming.codility.lesson9_maximum_slice_problem;

/*
  https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/

  Assume that:

  N is an integer within the range [3..100,000];
  each element of array A is an integer within the range [−10,000..10,000].

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

public class MaxDoubleSliceSum implements Callback {

    //contributed by caseyj1229
    public static int solution(int[] A) {
        int maxSum = 0;
        int[] maxSumEnd = new int[A.length];
        int[] maxSumStart = new int[A.length];

        //Use Kadane's Algorithm in 2 directions
        //Find the sum going forward and in reverse
        for (int i = 1, j = A.length - 2; i < A.length - 1; i++, j--) {
            maxSumEnd[i] = Math.max(maxSumEnd[i - 1] + A[i], 0);
            maxSumStart[j] = Math.max(maxSumStart[j + 1] + A[j], 0);
        }

        for (int i = 1; i < A.length - 1; i++) {
            maxSum = Math.max(maxSum, maxSumEnd[i - 1] + maxSumStart[i + 1]);
        }

        return maxSum;
    }

    // contributed by einhar
    public int solution2(int[] A) {
        int N = A.length;
        int[] K1 = new int[N];
        int[] K2 = new int[N];

        for (int i = 1; i < N - 1; i++) {
            K1[i] = Math.max(K1[i - 1] + A[i], 0);
        }
        for (int i = N - 2; i > 0; i--) {
            K2[i] = Math.max(K2[i + 1] + A[i], 0);
        }

        int max = 0;

        for (int i = 1; i < N - 1; i++) {
            max = Math.max(max, K1[i - 1] + K2[i + 1]);
        }

        return max;
    }

    @Override
    public void test() {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] B = {3, 2, 6, -1, 4, 5, -1, 2};
        int[] C = {7, 6, 5, 4, 3, 2, 1, 0};
        int[] D = {-1, -2, -3, -4, -5, -6, -7};
        int[] E = {-7, -6, -5, -4, -3, -2, -1};
        int[] F = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println("result: " + solution(A));
        System.out.println("result: " + solution(B));
        System.out.println("result: " + solution(C));
        System.out.println("result: " + solution(D));
        System.out.println("result: " + solution(E));
        System.out.println("result: " + solution(F));
    }
}
