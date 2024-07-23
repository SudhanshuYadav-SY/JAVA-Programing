import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int n1 ,n2,prod=0;
            System.out.println("Enter the first number - ");
            n1 = sc.nextInt();
            System.out.println("Enter the last number");
            n2 = sc.nextInt();
            System.out.println("Here is the Table of "+n1+" till your prescribed value of "+n2);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (int i = 1; i <=n2; i++)
            {
                prod = n1 * i;
                System.out.println(+n1+" * "+i+" = "+prod);
            }
    }
}