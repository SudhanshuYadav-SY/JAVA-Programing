import java.util.Scanner;

public class Transfer_Statements_In_One_Code
{
    public static void main(String[] args)
    {
        //Case 1 Implementation of Break Statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        while (a<=5)
        {
            System.out.println("Case 1 Output is below. . .");
            System.out.println("My name is Sudhanshu Yadav");
            break;
        }
        //Case 2 Implementation of Continue Statement
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Case 2 Output is below. . .");
        while (a<0)
        {
            System.out.println("My name is Sudhanshu Yadav");
            a++;
            continue;
        }
    }
}