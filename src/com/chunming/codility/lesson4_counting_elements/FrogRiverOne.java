package com.chunming.codility.lesson4_counting_elements;

/*
  https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(X).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
* */

import com.chunming.Callback;
import java.util.Arrays;

public class FrogRiverOne implements Callback {

    public int solution(int X, int[] A) {
        int stepAt = -1, leafCount = 0;
        boolean[] leaves = new boolean[X];
        for (int i = 0; i < A.length; i++) {
            if (!leaves[A[i]-1]) {
                leaves[A[i]-1] = true;
                leafCount++;
            }

            if (leafCount == X) {
                stepAt = i;
                return stepAt;
            }
            System.out.format("[%d] %d, count: %d\n", i, A[i], leafCount);
        }

        System.out.println(Arrays.toString(leaves));
        return -1;
    }

    @Override
    public void test() {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.format("%d\n", solution(5, A));

        int[] B = {1, 3, 1, 3, 2, 1, 3};
        System.out.format("%d\n", solution(3, B));
    }
}
