package My_Programs;
import java.util.Scanner;


public class Find_Area {
public static void main(String[] args) {
	double radius,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of radius");
	radius=sc.nextDouble();
	area= Math.PI*radius*radius;
	System.out.println(area);
	
	
	
}
}
