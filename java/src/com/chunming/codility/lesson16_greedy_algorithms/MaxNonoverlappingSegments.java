package com.chunming.codility.lesson16_greedy_algorithms;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/16-greedy_algorithms/max_nonoverlapping_segments/

  Find a maximal set of non-overlapping segments.

  Assume that:

  N is an integer within the range [0..30,000];
  each element of arrays A, B is an integer within the range [0..1,000,000,000];
  A[I] ≤ B[I], for each I (0 ≤ I < N);
  B[K] ≤ B[K + 1], for each K (0 ≤ K < N − 1).

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class MaxNonoverlappingSegments implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}