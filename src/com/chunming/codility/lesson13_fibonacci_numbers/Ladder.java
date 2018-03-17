package com.chunming.codility.lesson13_fibonacci_numbers;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/13-fibonacci_numbers/ladder/

  Count the number of different ways of climbing to the top of a ladder.

  Assume that:

  L is an integer within the range [1..50,000];
  each element of array A is an integer within the range [1..L];
  each element of array B is an integer within the range [1..30].

  Complexity:

  expected worst-case time complexity is O(L);
  expected worst-case space complexity is O(L).
*/


import com.chunming.Callback;

public class Ladder implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}