package com.chunming.codility.lesson4_counting_elements;

/*
  https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).


  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger implements Callback {

    public int solution(int[] A) {
        Set<Integer> matches = new HashSet<>();
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                max = Math.max(A[i], max);
                matches.add(A[i]);
            }
        }
        System.out.format("max: %d\n", max);
        for (int i = 1; i <= max + 1; i++) {
            if (!matches.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    // contributed by charles_wangkai
    public int solution2(int[] A) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : A) {
            numbers.add(number);
        }
        for (int i = 1;; i++) {
            if (!numbers.contains(i)) {
                return i;
            }
        }
    }

    @Override
    public void test() {
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, 3};

        System.out.format("smallest: %d\n\n", solution(A));
        System.out.format("smallest: %d\n\n", solution(B));
        System.out.format("smallest: %d\n\n", solution(C));

        System.out.format("smallest: %d\n\n", solution2(A));
        System.out.format("smallest: %d\n\n", solution2(B));
        System.out.format("smallest: %d\n\n", solution2(C));
    }
}
