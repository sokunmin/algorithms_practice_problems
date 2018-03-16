package com.chunming.codility.lesson2_arrays;

import com.chunming.Callback;

/*
  https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import java.util.*;

public class OddOccurrencesInArray implements Callback {

    public int solution(int[] A) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            //System.out.format("[%d] %d\n", i, A[i]);
            if (pairs.get(A[i]) != null) {
                pairs.put(A[i], pairs.get(A[i]) + 1);
            } else {
                pairs.put(A[i], 1);
            }
        }

        // iterate all items
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.format("[%d]: %d\n", key, value);
            if ((value % 2) == 1) {
                return key;
            }
        }
        return 0;
    }

    @Override
    public void test() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A));

        int[] B = {42};
        System.out.println(solution(B));

        int[] C = {2, 2, 3, 3, 4};
        System.out.println(solution(C));
    }
}
