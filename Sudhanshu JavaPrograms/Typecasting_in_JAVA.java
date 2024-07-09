public class Typecasting_in_JAVA
{
    public static void main(String[] args)
    {
        double a = 9;               //Here data literal is int and data type is 9 so java will automatically convert it to double
        System.out.println(a);
        int b = 3.674F;             //Here Data literal is float and data type is int hence type casting will be done
        System.out.println(b);
        int c = true;               //Here Data literal is boolean and data type is int hence Compiler Error will occur
        System.out.println(c);
    }
}