package com.chunming.algorithms.dynamic_programming;

/*
  https://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/
 */

import com.chunming.Callback;

public class RodCutting implements Callback {

    public int solution(int[] price) {
        int n = price.length;
        int val[] = new int[n + 1];
        val[0] = 0;

        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i <= n; i++) {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                System.out.format("i[%d], j[%d]\n", i, j);
                System.out.format("price[j=%d]: %d + val[%d]: %d => %d\n", j, price[j],
                        (i-j-1), val[(i-j-1)], price[j] + val[i - j - 1]);
                max_val = Math.max(max_val, price[j] + val[i - j - 1]);
            }
            val[i] = max_val;
            System.out.println();
        }

        return val[n];
    }

    @Override
    public void test() {
        int A[] = new int[]{1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum Obtainable Value is " + solution(A));
    }
}
