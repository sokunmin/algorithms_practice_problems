package com.chunming.codility.lesson12_euclidean_algorithm;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/12-euclidean_algorithm/chocolates_by_numbers/

  There are N chocolates in a circle. Count the number of chocolates you will eat.

  Assume that:
  N and M are integers within the range [1..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(log(N+M));
  expected worst-case space complexity is O(log(N+M)).
*/


import com.chunming.Callback;

public class ChocolatesByNumbers implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}