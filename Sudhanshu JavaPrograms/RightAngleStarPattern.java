import java.util.Scanner;

public class RightAngleStarPattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows you want in your triangle");
        int rowCount = sc.nextInt();
        for (int i=0;i<rowCount;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
