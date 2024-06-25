import java.util.Scanner;

public class Product_of_Numbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a , b , prod ;
        System.out.println("Enter the value of a & b");
        a = sc.nextInt();
        b = sc.nextInt();
        prod = a * b;
        System.out.println(prod);
    }
}
