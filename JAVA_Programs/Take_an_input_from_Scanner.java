package My_Programs;

import java.util.Scanner;

public class Take_an_input_from_Scanner {
	
	public static void main(String[] args)
	{

	Scanner sc= new Scanner(System.in);  // we are using here 
	System.out.println("Enter your Name"); // op 
	String name= sc.nextLine();   // jo name hmne dala usne usko scan kia 
	System.out.println("Your name is: "+name);

	}

	}

