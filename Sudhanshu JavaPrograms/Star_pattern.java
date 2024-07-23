import java.util.Scanner;

public class Star_pattern
{
    public static void ReverseStar()
    {
        //This is the code to print Star Pattern in Reverse Order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows you want stars to print in reverse order");
        int row = sc.nextInt();
        System.out.println("Reverse Star Pattern");
        for (int i = row; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void StarPattern()
    {
        //This is the code to print Star Pattern in Ideal Order
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows you want stars to print in original");
        int row = sc.nextInt();
        System.out.println("Original Star Pattern");
        for (int i = 0; i <= row; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        StarPattern();
        ReverseStar();
    }
}