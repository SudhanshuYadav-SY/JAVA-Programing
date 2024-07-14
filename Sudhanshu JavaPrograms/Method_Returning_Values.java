import java.util.Scanner;

public class Method_Returning_Values
{
    public static int Sum(int a , int b)
    {
        int Sum = 0 ;
        Sum += a + b ;
        return Sum ;
    }

    public static void main(String[] args)
    {
        System.out.println("Actual Sum of 2 Numbers = "+Sum(7,9));
    }
}