package com.chunming.codility.lesson6_sorting;

/*
  https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/

  Complexity:

  expected worst-case time complexity is O(N*log(N));
  expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;

public class MaxProductOfThree implements Callback {

    public int solution(int[] A) {
        System.out.format("unsorted: %s\n", Arrays.toString(A));

        Arrays.sort(A);
        System.out.format("sorted: %s\n", Arrays.toString(A));
        int product1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        int product2 = A[A.length-1] * A[0] * A[1];
        return Math.max(product1, product2);
    }

    @Override
    public void test() {
        int [] A = {-3, 1, 2, -2, 5, 6};
        int [] B = {-5, 5, -5, 4};
        System.out.format("max: %d\n", solution(A));
        System.out.format("max: %d\n", solution(B));
    }
}
