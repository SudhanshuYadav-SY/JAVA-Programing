import java.util.Scanner;

public class Check_Character_Is_Vowel_Or_Not
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter any random character of your choice");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Character Entered is a Vowel");
        }
        else
        {
            System.out.println("You Entered A Consonant");
        }
    }
}