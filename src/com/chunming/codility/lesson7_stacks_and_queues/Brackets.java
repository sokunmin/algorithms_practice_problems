package com.chunming.codility.lesson7_stacks_and_queues;

/*
  https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/

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

import java.util.Stack;

public class Brackets implements Callback {

    public int solution(String S) {

        Stack<Character> brackets = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
                if (brackets.isEmpty())
                    return 0;

                char leftBracket = brackets.pop();

                if (leftBracket != '(' && chars[i] == ')' ||
                    leftBracket != '[' && chars[i] == ']' ||
                    leftBracket != '{' && chars[i] == '}') {
                    return 0;
                }

            } else {
                brackets.push(chars[i]);
            }
        }
        return brackets.isEmpty() ? 1 : 0;
    }

    @Override
    public void test() {
        String S1 = "{[()()]}";
        String S2 = "([)()]";

        System.out.format("s: %s => %d\n", S1, solution(S1));
        System.out.format("s: %s => %d\n", S2, solution(S2));
    }
}
