package level01.lesson08.task03;

public class Solution {
    public static void main(String[] args)
    {
        for (int i = 0; i != 4; i++){
            String s = "What you plant now, you will harvest later.";
            print4Times(s);
        }
    }

    public static void print4Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
