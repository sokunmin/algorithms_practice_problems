package com.chunming.codility.lesson7_stacks_and_queues;

/*
  https://app.codility.com/programmers/lessons/7-stacks_and_queues/fish/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N)

  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Arrays;
import java.util.Stack;

public class Fish implements Callback {

    public int solution(int[] A, int[] B) {
        final int UPSTREAM = 0;
        Stack<Integer> downstream = new Stack<>();
        int aliveFish = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == UPSTREAM) {
                while(!downstream.isEmpty() && A[i] > A[downstream.peek()]) {
                    downstream.pop();
                    aliveFish--;
                }
                if (downstream.isEmpty())
                    aliveFish++;
            } else {
                downstream.push(i);
                aliveFish++;
            }
        }
        return aliveFish;
    }

    public int solution4(int[] A, int[] B) {
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
        /* additional checks:
         * [1] make sure the lengths of A and B are the same.
         */


        final int UPSTREAM = 0;
        final int DOWNSTREAM = 1;
        Stack<Integer> stack = new Stack<>();
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else {
                for (; !stack.isEmpty() && stack.peek() < A[i]; stack.pop()) {
                }
                if (stack.isEmpty()) {
                    n++;
                }
            }
        }
        return n + stack.size();
    }

    // contributed by charles_wangkai
    public int solution2(int[] A, int[] B) {
        Stack<Integer> livingIndices = new Stack<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 0) {
                while (!livingIndices.empty() && B[livingIndices.peek()] == 1 && A[i] > A[livingIndices.peek()]) {
                    livingIndices.pop();
                }

                if (!(!livingIndices.empty() && B[livingIndices.peek()] == 1)) {
                    System.out.format("push (0): [%d] %d\n", i, A[i]);
                    livingIndices.push(i);
                }
            } else {
                System.out.format("push (1): [%d] %d\n", i, A[i]);
                livingIndices.push(i);
            }
        }
        return livingIndices.size();
    }

    //contributed by neno--
    public int solution3(int[] A, int[] B) {
        final int[] sizes = A; // unique members
        final int[] direction = B;
        final int DOWNSTREAM = 1;

        int aliveUpstreamFishes = 0;

        Stack<Integer> downstreamFishes = new Stack<Integer>();

        for (int i = 0; i < sizes.length; i++) {
            if (direction[i] == DOWNSTREAM) {
                downstreamFishes.push(i);
                continue;
            }

            while (!downstreamFishes.isEmpty()) {
                int fish = downstreamFishes.pop();
                if (sizes[fish] > sizes[i]) {
                    downstreamFishes.push(fish);
                    break;
                }
            }

            if (downstreamFishes.isEmpty()) {
                aliveUpstreamFishes++;
            }
        }

        return aliveUpstreamFishes + downstreamFishes.size();
    }

    @Override
    public void test() {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(solution(A, B));

        int[] C = {0, 1};
        int[] D = {1, 1};
        System.out.println(solution(C, D));
    }
}
