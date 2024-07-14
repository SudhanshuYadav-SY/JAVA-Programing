import java.util.Scanner;

public class Method_Returning_Values
{
    public static int Sum(int a , int b)
    {
        int Sum = 0 ;
        Sum += a + b ;
        //return Sum ;
    }

    public static void main(String[] args)
    {
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Actual Sum of "+a+" & "+b+" = "+Sum(a,b));
    }
}