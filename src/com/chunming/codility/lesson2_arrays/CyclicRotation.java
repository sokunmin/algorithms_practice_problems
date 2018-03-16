package com.chunming.codility.lesson2_arrays;

/*
    https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/

    +-------------------+
    | Task Score:  100% |
    | Correctness: 100% |
    +-------------------+
    */

import com.chunming.Callback;

import java.util.Arrays;

public class CyclicRotation implements Callback {

    public void solution(int[] A, int K) {
        int size = A.length;
        int[] cyclic = new int[size];
        for (int i = 0; i < size; i++) {
            cyclic[(i + K) % size] = A[i];
        }

        System.out.println(Arrays.toString(cyclic));
    }

    @Override
    public void test() {
        int[] A = {1, 2, 3, 4};
        solution(A, 6);
    }
}
