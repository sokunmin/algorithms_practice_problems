package com.chunming.codility.lesson12_euclidean_algorithm;

/*
  [RESPECTABLE]
  https://app.codility.com/programmers/lessons/12-euclidean_algorithm/common_prime_divisors/

  Check whether two numbers have the same prime divisors.

  Assume that:

  Z is an integer within the range [1..6,000];
  each element of arrays A, B is an integer within the range [1..2,147,483,647].

  Complexity:

  expected worst-case time complexity is O(Z*log(max(A)+max(B))^2);
  expected worst-case space complexity is O(1)
*/


import com.chunming.Callback;

public class CommonPrimeDivisors implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}