package com.chunming.codility.lesson10_prime_and_composite_numbers;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/

  Count factors of given number n.
  Assume that:

  N is an integer within the range [1..2,147,483,647].

  Complexity:

  expected worst-case time complexity is O(sqrt(N));
  expected worst-case space complexity is O(1).
 */

import com.chunming.Callback;

public class CountFactors implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}
