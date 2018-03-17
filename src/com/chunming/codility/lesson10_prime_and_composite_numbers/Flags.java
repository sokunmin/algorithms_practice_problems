package com.chunming.codility.lesson10_prime_and_composite_numbers;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/flags/

  Find the maximum number of flags that can be set on mountain peaks.

  Assume that:

  N is an integer within the range [1..400,000];
  each element of array A is an integer within the range [0..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */

import com.chunming.Callback;

public class Flags implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}
