import java.util.Scanner;

public class Check_Odd_Even
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter any random number");
        num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("Number Entered is Even");
        }
        else
        {
            System.out.println("Number Entered is Odd");
        }
    }
}