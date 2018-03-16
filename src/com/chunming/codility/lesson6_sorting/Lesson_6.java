package com.chunming.codility.lesson6_sorting;

public class Lesson_6 {

    public static int solution1(int A[]) {
        //https://stackoverflow.com/questions/33375769/a-zero-indexed-array-given-an-equilibrium-index-of-this-array
        long sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += (long) A[i];
            System.out.format("[%d] sum: %d\n", i, sum);
        }
        System.out.println("sum: "+ sum);
        long leftSum = 0;
        long rightSum = 0;

        for (int i = 0; i < A.length; i++) {
            rightSum = sum - (leftSum + A[i]);
            System.out.format("[%d] right: %d = %d - (%d + %d)\n", i, rightSum, sum, leftSum, A[i]);
            if (leftSum == rightSum) {
                System.out.format("[%d] left(%d) == right(%d)", i, leftSum, rightSum);
                return i;
            }
            leftSum += A[i];
            System.out.format("[%d] left: %d\n", i, leftSum);
        }
        return -1;
    }

    public int solution2(int[] A) {
        // First calculate sum of complete array as `sum_right`
        long sumRight = 0;
        for (int i = 0; i < A.length; i++) {
            sumRight += A[i];
            System.out.format("[%d] right: %d\n", i, sumRight);
        }

        // start calculating sum from left side (lower index) as `sum_left`
        // in each iteration subtract A[i] from complete array sum - `sum_right`
        long sum_left = 0;
        for (int p = 0; p < A.length; p++) {
            sum_left += p - 1 < 0 ? 0: A[p-1];
            sumRight -= A[p];
            if (sum_left == sumRight) {
                return p;
            }
        }
        return -1;


    }

    public static int solution_disk(int[] A) {
        // write your code in Java SE 8
        // the original version is at
        // http://stackoverflow.com/questions/4801242/algorithm-to-calculate-number-of-intersecting-discs
        int N = A.length;
        if (N < 2)
            return 0;
        // stores the number of discs which start at each point
        int[] discStart = new int[N];
        // stores the number of discs which end at each point
        int[] discEnd = new int[N];
        for (int i = 0; i < N; i++) {
            discStart[Math.max(0, i - A[i])]++;
            // the result of i + A[i] could be over the max integer in java and
            // it will become a negative integer.
            if (i + A[i] < 0)
                discEnd[N-1]++;
            else
                discEnd[Math.min(N - 1, i + A[i])]++;
        }
        // the number of discs which haven't been calculated at a very point
        int unCalcDiscNo = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (discStart[i] > 0) {
                // calculate the product of the number of discs that haven't
                // been calculated and the number of started discs at this point
                result += unCalcDiscNo * discStart[i];
                // calculate the number of intersections of the started discs at
                // this point, the algorithm is 1+2+...+N = N*(N-1)/2
                result += discStart[i] *(discStart[i] - 1) / 2;
                if (result > 10000000)
                    return -1;
                // add the number of start discs to unCalcDiscNo
                unCalcDiscNo += discStart[i];
            }
            if (discEnd[i] > 0)
                // subtract the calculated discs from unCalcDiscNo
                unCalcDiscNo -= discEnd[i];
        }
        return result;
    }

}
