package com.chunming.codility.lesson11_sieve_of_eratosthenes;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/11-sieve_of_eratosthenes/count_semiprimes/

  Count the semiprime numbers in the given range [a..b]

  Assume that:

  N is an integer within the range [1..50,000];
  M is an integer within the range [1..30,000];
  each element of arrays P, Q is an integer within the range [1..N];
  P[i] ≤ Q[i].

  Complexity:

  expected worst-case time complexity is O(N*log(log(N))+M);
  expected worst-case space complexity is O(N+M).
*/


import com.chunming.Callback;

public class CountSemiprimes implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}