package com.chunming.codility.lesson7_stacks_and_queues;

public class Lesson_7 {
    public static int solution(int[] H) {
        // write your code in Java SE 8
        int N = H.length;
        int[] stack = new int[N];
        int num = 0;
        stack[num++] = H[0];
        int result = 1;
        for (int i = 1; i < N; i++) {
            // store the stonewall in ascending order and pop out the larger
            // stonewall than the current stonewall
            System.out.format("[1] num: %d & right_block: %d > %d\n", num,  stack[num - 1] , H[i]);
            while (num > 0 && stack[num - 1] > H[i]) {
                num--;
            }
            // if the stack is empty or the top of stack isn't equal to the
            // current stonewall, then we should push the current stonewall in
            // the stack and add 1 to the result.
//            System.out.format("[2] num: %d & right_block: %d > %d\n", num, stack[num - 1] , H[i]);

            if (num == 0 || stack[num - 1] != H[i]) {
                stack[num++] = H[i];
                result++;
            }
        }
        return result;
    }

}
