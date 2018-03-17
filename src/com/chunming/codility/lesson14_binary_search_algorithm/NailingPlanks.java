package com.chunming.codility.lesson14_binary_search_algorithm;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/14-binary_search_algorithm/nailing_planks/

  Count the minimum number of nails that allow a series of planks to be nailed.

  Assume that:

  N and M are integers within the range [1..30,000];
  each element of arrays A, B, C is an integer within the range [1..2*M];
  A[K] ≤ B[K].

  Complexity:

  expected worst-case time complexity is O((N+M)*log(M));
  expected worst-case space complexity is O(M).
*/


import com.chunming.Callback;

public class NailingPlanks implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}