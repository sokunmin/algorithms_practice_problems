package com.chunming.codility.lesson4_counting_elements;

/*
  https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/

  Complexity:

  expected worst-case time complexity is O(N+M);
  expected worst-case space complexity is O(N).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;

public class MaxCounters implements Callback {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int value = 0, lastValue = 0;
        for (int v : A) {
            /* read the question carefully */
            if (v == N + 1) {
                lastValue = value;
            } else {
                int index = v - 1;
                counters[index] = Math.max(counters[index], lastValue);
                counters[index]++;
                value = Math.max(counters[index], value); /* > CAUTIOUS */
            }
        }

        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], lastValue);
        }
        return counters;
    }

    @Override
    public void test() {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] B = {2, 1, 1, 2, 1};
        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(solution(5, A)));
        System.out.println();
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(solution(1, B)));
    }
}
