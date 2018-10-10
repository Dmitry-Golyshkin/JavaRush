package Level02.lesson08.task04;

/* Minimum of four numbers
Write a function that returns a minimum of four numbers.
    The function min(a,b,c,d) has to use (call) the function min(a, b)
*/
public class Solution {

    public static int min(int a, int b, int c, int d)
    {
        //add your code here
        int j;
        if (a < b && a < c && a < d){
            j = a;
        } else
            if (b < a && b < c && b < d){
                j = b;
            } else
                if (c < a && c < b && c < d){
                    j = c;
                } else {
                    j = d;
                }
                    return j;

    }

    public static int min(int a, int b)
    {

        int i;
        i = a < b ? a : b;
        return i;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}