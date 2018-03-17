package com.chunming.codility.lesson10_prime_and_composite_numbers;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/min_perimeter_rectangle/

  Find the minimal perimeter of any rectangle whose area equals N.

  Assume that:

  N is an integer within the range [1..1,000,000,000].
  Complexity:

  expected worst-case time complexity is O(sqrt(N));
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

public class MinPerimeterRectangle implements Callback {

    public int solution(int N) {
        int minA = 0, minB = 0;
        int sqrtN = (int) Math.sqrt(N);
        // the length of A and B shoud be almost the same, just like a square.
        for (int i = sqrtN; i >= 1; i--) {
            if (N % i == 0) {
                minA = i;
                minB = N / minA;
                break;
            }
        }

        return 2 * (minA + minB);
    }

    // contributed by charles_wangkai
    public int solution2(int N) {
        int minPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                minPerimeter = Math.min(minPerimeter, 2 * (i + N / i));
            }
        }
        return minPerimeter;
    }

    @Override
    public void test() {
        System.out.println("result: " + solution(30));
        System.out.println("result: " + solution(35));
        System.out.println("result: " + solution(36));
        System.out.println("result: " + solution(37));
        System.out.println("-------------");
        System.out.println("result: " + solution2(30));
        System.out.println("result: " + solution2(35));
        System.out.println("result: " + solution2(36));
        System.out.println("result: " + solution2(37));

    }
}
