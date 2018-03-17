package com.chunming.codility.lesson10_prime_and_composite_numbers;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/peaks/

  Divide an array into the maximum number of same-sized blocks,
  each of which should contain an index P such that A[P - 1] < A[P] > A[P + 1].

  Assume that:

  N is an integer within the range [1..100,000];
  each element of array A is an integer within the range [0..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(N*log(log(N)));
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class Peaks implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}