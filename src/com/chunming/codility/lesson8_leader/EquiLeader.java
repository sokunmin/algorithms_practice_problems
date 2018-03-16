package com.chunming.codility.lesson8_leader;

/*
  https://app.codility.com/programmers/lessons/8-leader/equi_leader/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N).

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;
import java.util.Stack;

public class EquiLeader implements Callback {

    public int solution(int[] A) {
        System.out.println(Arrays.toString(A));
        Stack<Integer> leaders = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (leaders.isEmpty() || leaders.peek() == A[i]) {
                leaders.push(A[i]);
            } else {
                leaders.pop();
            }
        }

        if (leaders.size() == 0) {
            return 0;
        }

        // leader counts
        int leadCount = 0;
        for (int v : A) {
            if (v == leaders.peek()) {
                leadCount++;
            }
        }

        // A < length * 0.5 => A * 2 < length to avoid decimal issue.
        if (leadCount * 2 < A.length)
            return 0;

        int result = 0, leftCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaders.peek())
                leftCount++;

            // the lead counts on both left and right should be greater than a half.
            boolean leftHalf = leftCount * 2 > (i + 1);
            boolean rightHalf = (leadCount - leftCount) * 2 > (A.length - 1 - i);
            if (leftHalf && rightHalf) {
                result++;
            }
        }

        return result;
    }

    public int solution2(int[] A) {
        System.out.println(Arrays.toString(A));
        int candidate = 0;
        int count = 0;
        for (int number : A) {
            System.out.format("[%d] ", number);
            if (count == 0) {
                candidate = number;
                count++;
            } else if (number == candidate) {
                count++;
            } else {
                count--;
            }
            System.out.format("count: %d \n", count);
        }
        if (count == 0) {
            return 0;
        }
        int countCandidate = 0;
        for (int number : A) {
            if (number == candidate) {
                countCandidate++;
            }
        }
        if (countCandidate * 2 <= A.length) {
            return 0;
        }

        int result = 0;
        int countLeft = 0;
        for (int S = 0; S < A.length - 1; S++) {
            if (A[S] == candidate) {
                countLeft++;
            }

            if ((countLeft * 2 > S + 1) &&
                    (countCandidate - countLeft) * 2 > A.length - 1 - S) {
                result++;
            }
        }
        return result;
    }

    @Override
    public void test() {
        int[] A = {4, 3, 4, 4, 4, 2};
        int[] B = {4, 3, 3, 4, 4, 4, 2};
        int[] C = {4, 3, 3, 3, 4, 4, 4, 2};
        int[] D = {4, 3, 4, 3, 4, 3, 4};
        System.out.format("result: %d\n", solution(A));
//        System.out.format("result: %d\n", solution2(A));
//        System.out.format("result: %d\n", solution2(B));
//        System.out.format("result: %d\n", solution2(C));
//        System.out.format("result: %d\n", solution2(D));
    }
}
