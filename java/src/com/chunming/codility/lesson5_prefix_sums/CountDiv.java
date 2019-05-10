package com.chunming.codility.lesson5_prefix_sums;

/*
  https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/

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

public class CountDiv implements Callback {
    public int solution(int A, int B, int K) {
        /*
         Additional checks:
         [1] all given arguments are integers.
         [2] B is greater than A.
         [3] K is greater than 0.
         */

//        log(A, B, K);
        /* should try more test cases */
        int count = B/K - A/K; /* find the bounds */
        if ((A % K) == 0) {
            count++;
        }
        return count;
    }

    // contributed by charles_wangkai
    public int solution3(int A, int B, int K) {
        int lower = A / K * K;
        if (lower < A) {
            lower += K;
        }
        int upper = B / K * K;
        return (upper - lower) / K + 1;
    }

    public void log(int A, int B, int K) {
        int c = 0;
        for (int i=A; i<=B; i++) {
            if (i % K == 0) {
                c++;
                System.out.format("[%d] count: %d\n", i, c);
            }
        }
    }

    @Override
    public void test() {
        System.out.format("range: 11-345, count: %d\n", solution(11, 345, 17));
        System.out.format("range: 11-14, count: %d\n", solution(11, 14, 2));
        System.out.format("range: 6-11, count: %d\n", solution(6, 11, 2));
        System.out.format("range: 5-11, count: %d\n", solution(5, 11, 2));
        System.out.format("range: 0-11, count: %d\n", solution(0, 11, 2));
        System.out.format("range: 0-10, count: %d\n", solution(0, 11, 2));
        System.out.format("range: 0-1, count: %d\n", solution(0, 1, 2));
        System.out.format("range: 0-0, count: %d\n", solution(0, 0, 2));
        System.out.format("range: 1-1, count: %d\n", solution(1, 1, 2));


    }
}
