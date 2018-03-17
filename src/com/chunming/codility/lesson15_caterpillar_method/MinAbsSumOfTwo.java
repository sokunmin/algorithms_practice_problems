package com.chunming.codility.lesson15_caterpillar_method;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/15-caterpillar_method/min_abs_sum_of_two/

  Find the minimal absolute value of a sum of two elements.

  Assume that:

  N is an integer within the range [1..100,000];
  each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(N*log(N));
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class MinAbsSumOfTwo implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}