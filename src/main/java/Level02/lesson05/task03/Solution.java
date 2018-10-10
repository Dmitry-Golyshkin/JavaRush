package Level02.lesson05.task03;

/* I never said most of the things I said
Write a program that displays 20 times: «I never said most of the things I said.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "I never said most of the things I said.";//add your code here
        print8Times(s);
        print12Times(s);

    }

    public static void print2Times(String s)
    {
        System.out.println(s);
        System.out.println(s);
    }

    public static void print4Times(String s)
    {
        print2Times(s);
        print2Times(s);
    }

    public static void print8Times(String s)
    {
        print4Times(s);
        print4Times(s);
    }

    public static void print12Times(String s)
    {
        print8Times(s);
        print4Times(s);
    }

    public static void print16Times(String s)
    {
        print8Times(s);
        print8Times(s);
    }
}