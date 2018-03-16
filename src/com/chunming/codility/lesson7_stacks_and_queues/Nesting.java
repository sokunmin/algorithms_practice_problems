package com.chunming.codility.lesson7_stacks_and_queues;

/*
  https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/

  Complexity:

  expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
  +-------------------+
  | Task Score:  100% |
  | Correctness: 100% |
  | Performance: 100% |
  +-------------------+
 */

import com.chunming.Callback;

import java.util.Stack;

public class Nesting implements Callback {

    public int solution(String S) {
        System.out.println("S: " + S);
        if (S.length() % 2 != 0)
            return 0;
        Stack<Character> leftBrackets = new Stack<>();
        char[] brackets = S.toCharArray();
        for (char b : brackets) {
            if (b == ')') {
                if (leftBrackets.empty())
                    return 0;
                else
                    leftBrackets.pop();
            } else {
                leftBrackets.push(b);
            }
        }
        return (leftBrackets.size() > 0) ? 0 : 1;
    }

    @Override
    public void test() {
        String[] S = {"(()(())())", "())"};

        for (String s : S)
            System.out.println("result: " + solution(s));
    }
}
