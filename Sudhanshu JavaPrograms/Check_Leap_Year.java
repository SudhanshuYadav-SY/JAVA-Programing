import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        Scanner shivani = new Scanner(System.in);
        System.out.println("Enter a random year of your choice:");
        int year = shivani.nextInt();                       // Initialize and assign the value at the same time
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("Year Entered is a Leap Year");
                }
                else
                {
                    System.out.println("Year Entered is not a Leap Year");
                }
            }
            else
            {
                System.out.println("Year Entered is a Leap Year");
            }
        }
        else
        {
            System.out.println("Year Entered is not a Leap Year");
        }
    }
}