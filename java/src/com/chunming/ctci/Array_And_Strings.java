package com.chunming.ctci;

import java.util.Arrays;

public class Array_And_Strings {

    static boolean isUniqueChars1(String str) {
        int checker = 0;
        for (int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            int val = str.charAt(i) - 'a';
            System.out.format("char: %c(%d) - a(%d), var: %d\n", c, c, (int)'a', val);
            int shift_val = 1 << val;
            System.out.format("1 << var(%s): %s\n", Integer.toBinaryString(val), Integer.toBinaryString(shift_val));
            if ((checker & (1 << val)) > 0) {
                System.out.format("checker: %s\n", Integer.toBinaryString(checker));
                System.out.format("found %c at %d\n", str.charAt(i), i);
                return false;
            }
            checker |= (1 << val);
            System.out.format("checker: %s\n", Integer.toBinaryString(checker));
        }

        return true;
    }

    static boolean isUniqueChars2(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                System.out.println(String.format("found %c at %d", str.charAt(i), i));
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

    // -----------------------------------------
    // permutation
    // Note that in your interview, you should always check with your interviewer about the size of the character set.
    // We assumed that the character set was ASCII.
    static String sort(String str) {
        char [] content = str.toCharArray();
        System.out.println("unsorted: " + Arrays.toString(content));
        java.util.Arrays.sort(content);
        System.out.println("sorted: " + Arrays.toString(content));
        return new String(content);
    }

    static boolean permutation1(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println("Not match!");
            return false;
        }

        return sort(s).equals(sort(t));
    }

    static boolean permutation2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int [] letters = new int[128];
        System.out.println("letters: " + Arrays.toString(letters));
        for (int i=0; i<s.length(); i++) {
            letters[s.charAt(i)]++;
        }

        for(int i=0; i<t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                System.out.println("Not match!");
                return false;
            }
        }
        return true;

    }

    // URLify
    static void replaceSpaces(char [] str, int trueLength) {
        System.out.format("str.len: %d\n", trueLength);
        int spaceCount = 0, index, i = 0;
        for (i=0; i<trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        System.out.format("spaceCount: %d\nindex: %d\n", spaceCount, index);
        if (trueLength < str.length) str[trueLength] = '\0'; // end array

        for (i = trueLength-1; i>=0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
                System.out.println("[1] output: " + new String(str));
            } else {
                str[index -1 ] = str[i];
                index--;
                System.out.println("[2] output: " + new String(str));
            }
        }
    }

    // -----------------------------------------
    // 3 solutions of Permutation of Palindrome
    static boolean isPermutationOfPalindrome1(String phrase) {
        int [] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    /* Check that no more than one character has an odd count. */
    static boolean checkMaxOneOdd(int [] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
            }
            foundOdd = true;
        }
        return true;
    }

    /* Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
    * This is case insensitive. Non-letter characters map to -1. */
    static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /* Count how many times each character appears. */
    static int [] buildCharFrequencyTable(String phrase) {
        int []table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    static boolean isPermutationOfPalindrome2(String phrase) {
        int countOdd = 0;
        int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    static boolean isPermutationOfPalindrome3(String phrase) {
        int bitVector = createBitVector(phrase);

        return checkExactlyOneBitSet(bitVector);
    }

    static int createBitVector(String phrase) {
        int bitVector = 0;
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    /* Toggle the ith bit in the integer. */
    static int toggle(int bitVector, int index) {
        if (index < 0) return 0;

        int mask = 1 << index;
        System.out.println("mask: " + Integer.toBinaryString(mask));
        System.out.println("~mask: " + Integer.toBinaryString(~mask));
        if ((bitVector & mask) == 0) {
            bitVector |= mask;
            System.out.println("[1] bitVector: " + Integer.toBinaryString(bitVector) + "\n");
        } else {
            bitVector &= ~mask;
            System.out.println("[2] bitVector: " + Integer.toBinaryString(bitVector) + "\n");
        }
        return mask;
    }

    /* Check that exactly one bit is set by subtracting one from the integer and
     * ANDing it with the original integer. */
    static boolean checkExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    // -----------------------------------------
    // one edit away
    static boolean oneEditAway1(String first, String second) {
        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        } else if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }
        return false;
    }

    static boolean oneEditAway2(String first, String second) {
        // length check
        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }
        /* Get shorter and longer string.*/
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;
        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            System.out.format("s1[%d]: %c vs. s2[%d]: %c\n", index1, s1.charAt(index1), index2, s2.charAt(index2));
            if (s1.charAt(index1) != s2.charAt(index2)) {
                /* Ensure that this is the first difference found.*/
                if (foundDifference) return false;
                foundDifference = true;
                if (s1.length() == s2.length()) {//On replace, move shorter pointer
                    index1++;
                }
            } else {
                index1++; // If matching, move shorter pointer
            }
            index2++; // Always move pointer for longer string
        }
        return true;
    }

    static boolean oneEditReplace(String s1, String s2) {
        boolean findDifference = false;
        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (findDifference) {
                    return false;
                }
                findDifference = true;
            }
        }
        return true;
    }

    /* Check if you can insert a character into sl to make s2. */
    static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < s2.length() && index1 < s1.length()) {
            System.out.format("s1[%d]: %c vs. s2[%d]: %c\n", index1, s1.charAt(index1), index2, s2.charAt(index2));
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    // string compression
    static String compress1(String str) { //Bad running time
        String compressedString= "";
        int countConsecutive = 0;
        for (int i= 0; i < str.length(); i++) {
            countConsecutive++;

            /* If next character is different than current, append this char to result.*/
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedString += "" + str.charAt(i) + countConsecutive;
                countConsecutive = 0;
            }
        }
        return compressedString;
    }

    String compress(String str) {
        StringBuilder compressed= new StringBuilder();
        int countConsecutive= 0;
        for (int i= 0; i < str.length(); i++) {
            countConsecutive++;
        }

        /* If next character is different than current, append this char to result.*/
//        if (i + 1 >= str.length() || str.charAt(i) =! str.charAt(i + 1)) {
//            compressed.append(str.charAt(i));
//            compressed.append(countConsecutive);
//            countConsecutive = 0;
//        }
//        return compressed.length() < str.length() ? compressed.toString() : str;
        return "";
    }
}


