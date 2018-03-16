package com.chunming.codility.lesson5_prefix_sums;

/*
  https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
* */

import com.chunming.Callback;

import java.util.Arrays;

public class PassingCars implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));

        long MAX_CARS = (long) 1E9;
        long passingCars = 0;
        int direction = 0;
        long sum = 0;
        for (int d : A) {
            if (direction != d)
                sum++;
        }
        long passedCars = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == direction) { //same direction
                passingCars += (sum - passedCars);
            } else {
                passedCars++;
            }
        }
        return (passingCars > MAX_CARS)? -1: (int) passingCars;
    }

    @Override
    public void test() {
        int[] A = {0, 1, 0, 1, 1};
        int[] B = {0, 1, 1, 0, 0};
        int[] C = {0, 0, 0, 0, 0};
        int[] D = {1, 1, 1, 1, 1};
        int[] E = {1, 0, 0, 0, 1};
        int[] F = {0, 1, 1, 1, 0};
        int[] G = {1};
        int[] H = {0};
        int[] I = {0, 1, 0, 1, 0, 1};
        int[] J = {1, 0, 1, 0, 1, 0};
        int[] K = {0, 1};
        int[] L = {1, 0};


        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
        System.out.println(solution(D));
        System.out.println(solution(E));
        System.out.println(solution(F));
        System.out.println(solution(G));
        System.out.println(solution(H));
        System.out.println(solution(I));
        System.out.println(solution(J));
        System.out.println(solution(K));
        System.out.println(solution(L));
    }
}
