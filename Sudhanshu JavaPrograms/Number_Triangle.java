import java.util.Scanner;

public class Number_Triangle
{
    public static void Ideal_Number_Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows in triangle");
        int row = sc.nextInt();
        System.out.println("Ideal Triangle Pattern is Below . . .");
        for (int i = 1;i<=row;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void Reverse_Number_Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of rows");
        int row = sc.nextInt();
        System.out.println("Reverse Way is below . . . ");
        for (int i = row; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Ideal_Number_Triangle();
        Reverse_Number_Triangle();
    }
}