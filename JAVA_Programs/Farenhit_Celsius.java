
package My_Programs;
import java.util.Scanner;
public class Farenhit_Celsius 
{    
	
 public static void main(String[]args)
 {
	 float a,b;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter temp in farenhit");
	 a=sc.nextFloat();
	 b=(5*(a-32))/9;
	 System.out.println(b);
		 
 }
}


