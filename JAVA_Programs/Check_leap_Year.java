package My_Programs;
import java.util.Scanner;

public class Check_leap_Year {
	
	public static void main(String[] args) {
		
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter te value of year");
		year=sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("the year is a leap year");
				}
				else
				{
					System.out.println("the year is not a leap year");
				}
			}
			else
			{
				System.out.println("the year is a leap year");
			}
			
		}
		else
		{
			System.out.println("not a leap yr");
		}
		
	}
}


