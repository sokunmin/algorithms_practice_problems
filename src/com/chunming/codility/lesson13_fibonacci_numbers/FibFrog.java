package com.chunming.codility.lesson13_fibonacci_numbers;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/13-fibonacci_numbers/fib_frog/

  Count the minimum number of jumps required for a frog to get to the other side of a river.

  Assume that:

  N is an integer within the range [0..100,000];
  each element of array A is an integer that can have one of the following values: 0, 1.

  Complexity:

  expected worst-case time complexity is O(N*log(N));
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class FibFrog implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}