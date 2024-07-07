package My_Programs;
import java.util.Scanner;

public class Do_while_example {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the value of number");
        number=sc.nextInt();

        // do-while loop
        do {
            System.out.println(number);
            number+=5;
        } while (number <= 50);
    }
}
