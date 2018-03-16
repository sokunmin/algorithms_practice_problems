package com.chunming;


import com.chunming.algorithms.Algorithms_TestRunner;
import com.chunming.codility.Codility_TestRunner;

public class Main {

    public static void main(String[] args) {

        // Algorithms Test
        TestCase.test(new Algorithms_TestRunner());

        // Codility Test
        TestCase.test(new Codility_TestRunner());
    }


    private void test() {
//        String a = "ABCDEBA";

        // unique character
//        Array_And_Strings.isUniqueChars1(a);
//        Array_And_Strings.isUniqueChars2(a);
//        if (Array_And_Strings.permutation1(" god ", " dog ")) {
//            System.out.println("matched!");
//        }

//        if (Array_And_Strings.permutation2(" god ", " dog ")) {
//            System.out.println("matched!");
//        }

        // URLify
//        a = "Mr John Smith    ";
//        Array_And_Strings.replaceSpaces(a.toCharArray(), 13);

        // permutation of palindrome
//        a = "Tact Coa";
//        System.out.println(Array_And_Strings.isPermutationOfPalindrome1(a) + "\n--------\n");
//        System.out.println(Array_And_Strings.isPermutationOfPalindrome2(a) + "\n--------\n");
//        System.out.println(Array_And_Strings.isPermutationOfPalindrome3(a) + "\n--------\n");

        // oneEditAway
        // pale, ple -> true
        // pales, pale -> true
        // pale, bale -> true
        // pale, bae -> false
//        Array_And_Strings.oneEditAway1("pale", "ple");
//        Array_And_Strings.oneEditAway1("pales", "pale");
//        Array_And_Strings.oneEditAway1("pale", "bale");
//        Array_And_Strings.oneEditAway1("pale", "bae");
//        System.out.println("----------------------");
//        Array_And_Strings.oneEditAway2("pale", "ple");

        // Codility - lecture 6
//        int [] A = {-1, 3, -4, 5, 1, -6, 2, 1};
//        Lesson_6.solution(A, 8);
//        int [] A = {1, 5, 2, 1, 4, 0};
//        Lesson_6.solution_disk(A);

        // Codility - lecture 7
//        int [] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
//        System.out.println(Lesson_7.solution(A));
//        int [] arr = {1,2,0,8,1,9,9,3};
//        int [] arr = {8,24,3,20,1,17};
//        int [] arr = {7,21,3,42,3,7};
//        System.out.println(Interview.findMinDistance(arr));
    }
}
