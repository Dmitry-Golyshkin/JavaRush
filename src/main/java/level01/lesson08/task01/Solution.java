package level01.lesson08.task01;

import java.lang.String;

public class Solution {



    /* Life is not fair
    Write a program that displays 9 times: «Life is not fair - get used to it.».
    */

    public static void main(String[] args) {
        String s = "Life is not fair - get used to it.";
        print3Times(s);
        print3Times(s);
        print3Times(s);
    }

    public static void print3Times(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

}
