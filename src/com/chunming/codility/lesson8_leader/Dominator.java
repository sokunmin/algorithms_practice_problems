package com.chunming.codility.lesson8_leader;

/*
  https://app.codility.com/programmers/lessons/8-leader/dominator/
  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dominator implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));

        Map<Integer, Integer> numbers = new HashMap<>();
        int dominator = 0, dominatorIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (numbers.containsKey(A[i]))
                numbers.put(A[i], numbers.get(A[i]) + 1);
            else
                numbers.put(A[i], 1);

            if (numbers.get(A[i]) > dominator) {
                dominatorIndex = i;
            }
            dominator = Math.max(dominator, numbers.get(A[i]));
        }
        int sameCount = 0;
        for (Integer v : numbers.values()) {
            if (dominator == v) {
                sameCount++;
                if (sameCount > 1)
                    return -1;
            }
        }
        return (dominator <= A.length * 0.5) ? -1 : (int) dominatorIndex;
    }

    // contributed by charles_wangkai
    public int solution2(int[] A) {
        int index = -1;
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.format("[%d] %d ", i, A[i]);
            if (count == 0) {
                index = i;
                candidate = A[i];
                count++;
            } else if (A[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int countCandidate = 0;
        for (int number : A) {
            if (number == candidate) {
                countCandidate++;
            }
        }
        return (countCandidate * 2 > A.length) ? index : -1;
    }

    // contributed by smart-aleck
    public int solution3(int[] A) {
        // Using a stack approach but with 2 variables because
        // using an actual stack would make space complexity O(N)
        if (A.length == 0) return -1;

        int stackCount = 1;
        int dominator = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] == dominator) {
                stackCount++;
            } else {
                stackCount--;
                if (stackCount == 0) {
                    dominator = A[i];
                    stackCount++;
                }
            }
        }
        int dominatorIndex = -1;
        int dominatorCount = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] == dominator) {
                dominatorCount++;
                dominatorIndex = i;
            }

        System.out.println("Dominator: " + dominator);

        if (dominatorCount > A.length / 2)
            return dominatorIndex;
        return -1;
    }


    @Override
    public void test() {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int[] B = {3, 4, 3, 4, 3, 4, -1, 0};
        int[] C = {1, 2, 3, 4, 5, 1};
        int[] D = {1, 2, 1};
        int[] E = {0, 0, 1, 1, 1};
        int[] F = {2147483647};

        System.out.format("result: %d\n\n", solution2(A));
        System.out.format("result: %d\n\n", solution(B));
        System.out.format("result: %d\n\n", solution(C));
        System.out.format("result: %d\n\n", solution(D));
        System.out.format("result: %d\n\n", solution(E));
        System.out.format("result: %d\n\n", solution(F));
    }
}
