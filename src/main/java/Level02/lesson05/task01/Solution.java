package Level02.lesson05.task01;


/* Many people are alive
Write a program that displays 3 times: «Many people are alive only because it's illegal to shoot them.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i != 3; i++){
            String s = "Many people are alive only because it's illegal to shoot them.";
            print3Times(s);
        }
    }

    public static void print3Times(String s)
    {
        System.out.println(s);

    }

}

