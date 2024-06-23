import java.util.Scanner;
public class Swap_Two_Numbers
{
    public static void main(String[] args)
    {
        int a , b , temp ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A");
        a = sc.nextInt();
        System.out.println("Enter the value of B");
        b = sc.nextInt();
        //temp = a ;
        //a = b ;
        //b = temp ;
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println(a);
        System.out.println(b);
    }
}