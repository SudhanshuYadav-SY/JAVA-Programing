import java.util.Scanner;

public class Reverse_A_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any random number . . .");
        int num = sc.nextInt();
        int reverse = 0, digit = 0,original;
        original = num;
        while (num!= 0)
        {
           digit = num % 10;
           reverse = reverse*10 + digit;
           num /= 10;
        }
        System.out.println("Original Number is - "+original);
        System.out.println("Reversed Number is - "+reverse);
    }
}