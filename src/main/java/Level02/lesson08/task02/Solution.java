package Level02.lesson08.task02;

import java.lang.System;

/* Maximum of two numbers
Write a function that returns a maximum of two numbers.
*/
public class Solution {

    public static int min(int a, int b) {
        //add your code here
        int m2;
        m2 = a > b ? a : b;
        return m2;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(12,33) );
        System.out.println( min(-20,0) );
        System.out.println( min(-10,-20) );
    }

}