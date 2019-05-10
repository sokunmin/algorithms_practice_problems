package com.chunming.ctci;

public class BigO {

    public void permutation(String str) {
        permutation(str,"");
    }

    public void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("prefix: " + prefix);
        } else {
            System.out.println("permutation("+str+", "+prefix+")");
            for (int i=0; i<str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                System.out.println(String.format("> %s  = %s + %s", rem, str.substring(0, i), str.substring(i+1)));
                permutation(rem, prefix + str.charAt(i));
            }
            System.out.println("---------------");

        }
    }

    void big_o_testcase(String str) {
        // Big-O
        String output = str.substring(0);
        System.out.println(output);
        output = str.substring(1);
        System.out.println(output);
        output = str.substring(2);
        System.out.println(output);
//        BigO bigO = new BigO();
//        bigO.permutation("ABCDEF");
    }
};