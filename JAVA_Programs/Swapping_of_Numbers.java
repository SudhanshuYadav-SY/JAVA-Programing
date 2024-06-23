package My_Programs;
import java.util.Scanner;

public class Swapping_of_Numbers 
{

public static void main(String[] args)
{
	int a,b,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter value of a");
	a=sc.nextInt();
	System.out.println("enter value of b");
	b=sc.nextInt();
	//temp=a;
	//a=b;
	//b=temp;
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);
}
}
