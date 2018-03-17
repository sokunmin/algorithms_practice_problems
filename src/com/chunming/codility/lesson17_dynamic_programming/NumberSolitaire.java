package com.chunming.codility.lesson17_dynamic_programming;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/17-dynamic_programming/number_solitaire/

  In a given array, find the subset of maximal sum in which the distance between consecutive elements is at most 6.

  Assume that:

  N is an integer within the range [2..100,000];
  each element of array A is an integer within the range [−10,000..10,000].

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N)
*/


import com.chunming.Callback;

public class NumberSolitaire implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}