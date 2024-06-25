import java.util.Scanner;

//Case 1: Comparison Between 2 Numbers
public class Compare_numbers
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        /* This is Case 1 Where we compared 2 numbers
        if (a > b)
        {
            System.out.println("A is greater than B");
        }
        else
        {
            System.out.println("B is greater than A");
        }
         */
        //Case 2: This is Case 2 Where we compare 3 numbers
        int c;
        System.out.println("Enter the value of c");
        c = sc.nextInt();
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("Number A is the greatest");
            }
            else
            {
                System.out.println("Number C is the greatest");
            }
        }
        else
        {
         if (b > c)
         {
             System.out.println("Number B is the greatest");
         }
         else
         {
             System.out.println("Number C is the greatest");
         }
        }
    }
}