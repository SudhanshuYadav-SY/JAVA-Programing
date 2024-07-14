import java.util.Scanner;

public class Method_Returning_Values
{
    public static double Sum(double a , double b)
    {
        int Sum = 0 ;            //Initialize Sum Variable
        Sum += a + b ;           //Sum = Sum + a + b
        return Sum ;            //Transfer Statement
    }

    public static void main(String[] args)
    {
        double a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Actual Sum of "+a+" & "+b+" = "+Sum(a,b));
    }
}