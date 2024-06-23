import java.util.Scanner;
public class Sum_of_Numbers
{
    public static void main(String[] args)
    {
        int a , b ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        sum = a + b ;
        System.out.println(sum);
    }
}
