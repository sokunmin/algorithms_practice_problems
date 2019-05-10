package com.chunming.codility.lesson16_greedy_algorithms;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/16-greedy_algorithms/tie_ropes/

  Tie adjacent ropes to achieve the maximum number of ropes of length >= K..

  Assume that:

  N is an integer within the range [1..100,000];
  K is an integer within the range [1..1,000,000,000];
  each element of array A is an integer within the range [1..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class TieRopes implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}