package com.chunming.codility.lesson17_dynamic_programming;

/*
  [AMBITIOUS]
  https://app.codility.com/programmers/lessons/17-dynamic_programming/min_abs_sum/

  Given array of integers, find the lowest absolute sum of elements.

  Assume that:

  N is an integer within the range [0..20,000];
  each element of array A is an integer within the range [−100..100].

  Complexity:

  expected worst-case time complexity is O(N*max(abs(A))^2);
  expected worst-case space complexity is O(N+sum(abs(A))), beyond input storage (not counting the storage required for input arguments).
*/


import com.chunming.Callback;

public class MinAbsSum implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}