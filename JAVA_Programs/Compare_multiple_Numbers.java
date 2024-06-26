package My_Programs;
import java.util.Scanner;
public class Compare_multiple_Numbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value of a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
			else
			{
				if(b>c)
				{
					System.out.println("b is greatest");
				}
				else
				{
					System.out.println("c is greatest");
				}
				
			}
	}
	
}

					
		
	


