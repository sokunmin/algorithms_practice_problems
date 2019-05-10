package com.chunming.codility.lesson4_counting_elements;

/*
  https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/

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

public class PermCheck implements Callback {

    public int solution(int[] A) {
        Set<Integer> matches = new HashSet<>();

        for (int i=0; i<A.length; i++) {
            matches.add(i+1);
        }

        for (int v : A) {
            matches.remove(v);
        }
        return (matches.size() > 0)? 0:1;
    }

    // contributed by charles_wangkai
    public int solution2(int[] A) {
        boolean[] used = new boolean[A.length];
        for (int number : A) {
            if (number < 1 || number > A.length || used[number - 1]) {
                return 0;
            }
            used[number - 1] = true;
        }
        return 1;
    }

    @Override
    public void test() {
        int [] A = {4, 1, 3, 2};
        int [] B = {4, 1, 3};

        System.out.format("Result: %d\n", solution(A));
        System.out.format("Result: %d\n", solution(B));
    }
}
