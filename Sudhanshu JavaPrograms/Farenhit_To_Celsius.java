import java.util.Scanner;
public class Farenhit_To_Celsius
{
    public static void main(String[] args)
    {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature");
        a = sc.nextFloat();
        b = (5*(a-32))/9;
        System.out.println("Temperature in Celsius = "+b);
    }
}