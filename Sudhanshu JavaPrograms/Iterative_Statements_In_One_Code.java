import java.util.Scanner;

public class Iterative_Statements_In_One_Code
{

    //Case 1 That is While loop

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int A = sc.nextInt();
        System.out.print("\n");
        System.out.println("Case 1 Output is Below . . .");
        while (A<=15)           //While-loop is an Iterative Statement
        {
            System.out.print(A+","+"\t");
            A++;
        }

        //Case 2 That is Do-While loop

        System.out.println("\n");
        System.out.println("Case 2 Output is Below . . .");
        do
        {
            System.out.print(A+","+"\t");
            A--;
        }
        while (A>=1);

        //Case 3 For loop starts

        System.out.println("\n");
        System.out.println("Case 3 Output is Below . . .");
        for (int i = A;i<=15;i++)
        {
            System.out.print(i+","+"\t");
        }
    }
}