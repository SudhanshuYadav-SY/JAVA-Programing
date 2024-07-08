import java.util.Scanner;

public class While_Loop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int A = sc.nextInt();
        while (A<=15)           //While-loop is an Iterative Statement
        {
            System.out.print(A+","+"\t");
            A++;
        }
    }
}
