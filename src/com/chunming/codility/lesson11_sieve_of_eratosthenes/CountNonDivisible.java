package com.chunming.codility.lesson11_sieve_of_eratosthenes;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_non_divisible/

  Calculate the number of elements of an array that are not divisors of each element.

  Assume that:

  N is an integer within the range [1..50,000];
  each element of array A is an integer within the range [1..2 * N].

  Complexity:

  expected worst-case time complexity is O(N*log(N));
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class CountNonDivisible implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}