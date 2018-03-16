package com.chunming.codility.lesson9_maximum_slice_problem;

import com.chunming.Callback;

import java.util.Arrays;

public class MaxProfit implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("result: " + solution(A));
    }
}
