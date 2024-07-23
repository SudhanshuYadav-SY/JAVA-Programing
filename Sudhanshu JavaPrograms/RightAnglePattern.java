import java.util.Scanner;

public class RightAnglePattern
{
public static void RightAngle()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows in triangle");
    int row = sc.nextInt();
    System.out.println("Here is your ideal right angle pattern");
    for (int i = 1; i<=row;i++)
    {
        for (int j=0;j<i;j++)
        {
            System.out.print("1");
        }
        System.out.println();
    }
}
public static void ReverseRightAngle()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows you want to print in the Reverse Order");
    int row = sc.nextInt();
    System.out.println("Here is your Reverse Right Angle Pattern");
    for (int i = row; i > 0;i--)
    {
        for (int j = 0; j<i;j++)
        {
            System.out.print("1");
        }
        System.out.println();
    }
}
public static void main(String[] args)
{
    RightAngle();
    ReverseRightAngle();
}
}