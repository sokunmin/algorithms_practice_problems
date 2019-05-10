package com.chunming.codility.interview_questions;

public class Interview {

    public static int findMinDistance(int[] arr) {
        int length = arr.length;
        int smallest = Integer.MAX_VALUE - 1;
        int smaller = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            if (arr[i] <= smallest) {
                System.out.format("[%d] %d <= smallest(%d)\n", i, arr[i], smallest);
                smaller = smallest;
                smallest = arr[i];
            } else if (arr[i] < smaller) {
                System.out.format("[%d] %d <= smaller(%d)\n", i, arr[i], smaller);
                smaller = arr[i];
            }
        }
        return smaller - smallest;
    }// findMinDistance(int [] arr)

    public static void findMinDistance(int[] a, int x, int y) {
        int minDistance = Integer.MAX_VALUE;
        int firstIndex = -1;

        for (int i = 0; i < a.length; ++i) {
            if (a[i] == x || a[i] == y) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else {
                    if (a[i] != a[firstIndex]) {
                        int min = i - firstIndex;
                        if (min < minDistance) {
                            minDistance = min;
                        }
                    }
                    firstIndex = i;
                }
            }
        }
    }
}

