package com.chunming.codility.lesson3_time_complexity;

/*
  https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/

  Complexity:
  expected worst-case time complexity is O(1);
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

public class FrogJmp implements Callback {

    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int steps = distance / D;
        return ((distance % D) > 0) ? steps + 1 : steps;
    }

    @Override
    public void test() {
        System.out.format("Steps: %d\n", solution(10, 85, 30));
        System.out.format("Steps: %d\n", solution(10, 100, 30));
    }
}
