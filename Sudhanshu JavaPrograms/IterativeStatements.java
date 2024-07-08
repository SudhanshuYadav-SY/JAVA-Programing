import java.util.Scanner;

public class IterativeStatements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A & B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        //We can call variable named sum and each time output will be same as shown in figure below
        //To avoid same set of code again, and again we use ITERATIVE STATEMENTS
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
        System.out.println("Sum of "+a+" & "+b+" = "+sum);
    }
}