package com.chunming.codility.lesson6_sorting;

/*
  https://app.codility.com/programmers/lessons/6-sorting/triangle/

  Complexity:

  expected worst-case time complexity is O(N*log(N));
  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;

public class Triangle implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));

        Arrays.sort(A);
        // find a first value which is greater than 0 because each edge cannot be 0.
        int p = -1, q, r;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                p = i;
                break;
            }
        }

        // the size of the array is at least 3.
        if (p == -1 || A.length < 3) {
            return 0;
        }

        while (p < A.length-2) {
            q = p + 1;
            r = q + 1;

            boolean line1 = (long)A[p] + A[q] > A[r];
            boolean line2 = (long)A[q] + A[r] > A[p];
            boolean line3 = (long)A[r] + A[p] > A[q];

            if (line1 && line2 && line3) {
                return 1;
            }
            p++;
        }

        return 0;
    }

    // contributed by charles_wangkai
    public int solution2(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if ((long) A[i] + A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public void test() {
        int[] A = {10, 2, 5, 1, 8, 20};
        int[] B = {10, 50, 5, 1};
        int[] C = {10, 10, 10};
        int[] D = {0, 0, 0};
        int[] E = {1, 2};
        int[] F = {2, 2, 0, 0, 1, 3, 0};
        System.out.format("result: %d\n\n", solution(A));
        System.out.format("result: %d\n\n", solution(B));
        System.out.format("result: %d\n\n", solution(C));
        System.out.format("result: %d\n\n", solution(D));
        System.out.format("result: %d\n\n", solution(E));
        System.out.format("result: %d\n\n", solution(F));
    }
}
