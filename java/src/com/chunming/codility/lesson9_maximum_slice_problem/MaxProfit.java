package com.chunming.codility.lesson9_maximum_slice_problem;

/*

  https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1).
  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;

public class MaxProfit implements Callback {

    // contributed by charles_wangkai
    public int solution2(int[] A) {
        System.out.println(Arrays.toString(A));
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : A) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    @Override
    public void test() {
        // N is an integer within the range [0..400,000];
        // each element of array A is an integer within the range [0..200,000].
        // return 0 if it was impossible to gain any profit
        // answer: 356
        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
        int[] B = {0, 1, 2, 3, 4, 5};
        int[] C = {5, 4, 3, 2, 1, 0};
        int[] D = {0, 0, 0, 0, 0, 0};
        int[] E = {8, 9, 3, 6, 1, 2};
        int[] F = {};
        System.out.println("result: " + solution2(A));
        System.out.println("result: " + solution2(B));
        System.out.println("result: " + solution2(C));
        System.out.println("result: " + solution2(D));
        System.out.println("result: " + solution2(E));
        System.out.println("result: " + solution2(F));
    }
}
