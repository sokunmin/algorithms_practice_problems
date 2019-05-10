package com.chunming.codility.lesson15_caterpillar_method;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/

  Compute number of distinct absolute values of sorted array elements..

  Assume that:

  N is an integer within the range [1..100,000];
  each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
  array A is sorted in non-decreasing order.

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class AbsDistinct implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}