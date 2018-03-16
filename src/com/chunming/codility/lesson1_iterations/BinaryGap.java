package com.chunming.codility.lesson1_iterations;

/*
  https://app.codility.com/programmers/lessons/1-iterations/binary_gap/

  Complexity:
  expected worst-case time complexity is O(log(N));
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
* */

import com.chunming.Callback;

public class BinaryGap implements Callback {

    public int solution1(Integer N) {
        System.out.format("N: %d, Binary: %s\n", N, Integer.toBinaryString(N));

        int maxGap = 0;
        int zeroCount = 0;
        boolean startCounting = false;
        while (N != 0) {
            if ((N & 1) == 0) {
                // encounter '0'
                zeroCount++;
            } else {
                // encounter '1'
                if (!startCounting) {
                    startCounting = true;
                } else {
                    maxGap = Math.max(maxGap, zeroCount);
                }
                zeroCount = 0;
            }

            N = N >> 1;
            //System.out.format("> Binary: %s\n", Integer.toBinaryString(N));
        }
        System.out.format("maxGap: %d\n", maxGap);
        return maxGap;
    }

    // solution by charles_wangkai
    public int solution2(int N) {
        System.out.format("N: %d, Binary: %s\n", N, Integer.toBinaryString(N));

        int maxGap = 0;
        boolean firstOne = true;
        int gap = 0;
        while (N != 0) {
            int bit = N % 2;
            if (bit == 0) {
                gap++;
            } else {
                if (firstOne) {
                    firstOne = false;
                } else {
                    maxGap = Math.max(maxGap, gap);
                }
                gap = 0;
            }
            N /= 2;
        }
        return maxGap;
    }

    @Override
    public void test() {
        int [] N = {20, 1041, 5, 1, 2147483647, 6, 328, 16, 1024};
        for (int v : N) {
            System.out.format("input: %d, \tresult: %d\n", v, solution1(v));
        }
        System.out.println("------- end of solution 1 -------");
        for (int v : N) {
            System.out.format("input: %d, result: %d\n", v, solution2(v));
        }
        System.out.println("------- end of solution 2 ---------");
    }
}
