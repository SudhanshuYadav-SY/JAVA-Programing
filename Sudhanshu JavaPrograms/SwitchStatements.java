import java.util.Scanner;

public class SwitchStatements
{
    public static void main(String[] args)
    {
      int a,b,ch;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of A");
      a = sc.nextInt();
      System.out.println("Enter the value of B");
      b = sc.nextInt();
      System.out.println("\t\t\t\t\t\t\t\t\t\t\tToday's Menu . . . . .");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t1 For Addition");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t2 For Subtraction");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t3 For Multiplication");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\t4 For Division");
      System.out.println("\t\t\t\t\t\t\t\t\t\t\tWhat Operation Should I Perform Today Sir?");
      ch = sc.nextInt();
      switch (ch)
      {
          case 1:
              System.out.println("Ok sir You have chosen Addition Operation");
              double sum = a + b;
              System.out.println("Sum of "+a+" AND "+b+" = "+sum);
              break;
          case 2:
              System.out.println("Ok sir You have chosen Subtraction Operation");
              double sub = a - b;
              System.out.println("Difference between "+a+" AND "+b+" = "+sub);
              break;
          case 3:
              System.out.println("Ok sir You have chosen Multiplication Operation");
              double product = a * b;
              System.out.println("Product of "+a+" AND "+b+" = "+product);
              break;
          case 4:
              System.out.println("Ok sir You have chosen Division Operation");
              double division = a / b;
              System.out.println("Dividing "+a+" by "+b+",you get result = "+division);
              break;
      }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ok Sir Thanks For Using My Calculator . . .");
        System.out.println("Until Next time Good Bye!!");
    }
}