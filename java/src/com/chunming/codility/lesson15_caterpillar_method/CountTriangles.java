package com.chunming.codility.lesson15_caterpillar_method;

/*
  [PAINLESS]
  https://app.codility.com/programmers/lessons/15-caterpillar_method/count_triangles/

  Count the number of triangles that can be built from a given set of edges.

  Assume that:

  N is an integer within the range [0..1,000];
  each element of array A is an integer within the range [1..1,000,000,000].

  Complexity:

  expected worst-case time complexity is O(N^2);
  expected worst-case space complexity is O(N).
*/


import com.chunming.Callback;

public class CountTriangles implements Callback {

    public int solution(int[] A) {
        return -1;
    }

    @Override
    public void test() {
        int[] A = {};
        System.out.println("" + solution(A));
    }
}