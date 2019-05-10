package com.chunming.codility.lesson7_stacks_and_queues;

/*
 https://app.codility.com/programmers/lessons/7-stacks_and_queues/stone_wall/

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

public class StoneWall implements Callback {

    // contributed by charles_wangkai
    public int solution(int[] H) {
        int[] heights = Arrays.copyOf(H, H.length + 1);
        System.out.println(Arrays.toString(heights));
        Stack<Integer> increasingHeights = new Stack<Integer>();
        int blockNum = 0;
        for (int height : heights) {
            System.out.format("[%d] ", height);
            while (!increasingHeights.empty() && increasingHeights.peek() >= height) {
                if (increasingHeights.peek() > height) {
                    blockNum++;
                    System.out.format("blockNum++ => (%d) | ", blockNum);
                }
                System.out.format("pop(%d) | ", increasingHeights.peek());
                increasingHeights.pop();
            }
            increasingHeights.push(height);
            System.out.format("push(%d) \n\n", height);
        }
        return blockNum;
    }

    // contributed by caseyj1229
    public int solution2(int[] H) {
        Stack<Integer> blocks = new Stack<Integer>();
        int blockCount = 0;

        for(int i = 0; i < H.length; i++) {
            //If the stack is not empty and the top
            //block is taller than the next block, remove top block and try again
            //Since Pop is O(1), will not increase complexity
            while(!blocks.isEmpty() && blocks.peek() > H[i]){
                blocks.pop();
            }
            //If the current block is taller than the previous or no previous block
            //needs to be built on, increase block count and put the current block on the stack
            if(blocks.isEmpty() || blocks.peek() < H[i]){
                blockCount++;
                blocks.push(H[i]);
            }
        }
        return blockCount;
    }

    @Override
    public void test() {
        int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.format("blocks: %d\n", solution(A));
    }
}
