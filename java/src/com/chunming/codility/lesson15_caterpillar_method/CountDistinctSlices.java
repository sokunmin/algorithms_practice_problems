package com.chunming.codility.lesson15_caterpillar_method;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/15-caterpillar_method/count_distinct_slices/

  Count the number of distinct slices (containing only unique numbers).

  Assume that:

  N is an integer within the range [1..100,000];
  M is an integer within the range [0..100,000];
  each element of array A is an integer within the range [0..M].

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(M).
*/


import com.chunming.Callback;

public class CountDistinctSlices implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}