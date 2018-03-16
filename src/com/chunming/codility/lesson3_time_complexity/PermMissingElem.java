package com.chunming.codility.lesson3_time_complexity;

/*
  https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

public class PermMissingElem implements Callback {

    public int solution(int[] A) {
        int N = A.length;
        /** Be CAUTIOUS on the range, we should use `long` here. **/
        long sum = ((N + 2L) * (N + 1L)) / 2;
        for (int v : A) {
            sum -= v;
        }
        return (int) sum;
    }

    @Override
    public void test() {

        int[] A = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        System.out.format("missing: %d\n\n", solution(A));

        int[] B = {1, 3};
        System.out.format("missing: %d\n\n", solution(B));

        int[] C = {2, 3, 1, 5};
        System.out.format("missing: %d\n\n", solution(C));

        int[] D = {};
        System.out.format("missing: %d\n\n", solution(D));
    }
}
