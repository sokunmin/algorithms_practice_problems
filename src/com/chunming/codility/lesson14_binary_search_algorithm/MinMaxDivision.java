package com.chunming.codility.lesson14_binary_search_algorithm;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/14-binary_search_algorithm/min_max_division/

  Divide array A into K blocks and minimize the largest sum of any block.

  Assume that:

  N and K are integers within the range [1..100,000];
  M is an integer within the range [0..10,000];
  each element of array A is an integer within the range [0..M].

  Complexity:

  expected worst-case time complexity is O(N*log(N+M));
  expected worst-case space complexity is O(1).
*/


import com.chunming.Callback;

public class MinMaxDivision implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}