package com.chunming.codility.lesson6_sorting;

/*
  https://app.codility.com/programmers/lessons/6-sorting/distinct/

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
import java.util.HashSet;
import java.util.Set;

public class Distinct implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));

        Set<Integer> numbers = new HashSet<>();

        for (int v : A) {
            numbers.add(v);
        }

        return numbers.size();
    }

    @Override
    public void test() {
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.format("distinct: %d\n", solution(A));
    }
}
