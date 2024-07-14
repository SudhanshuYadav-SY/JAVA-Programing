public class Enclose_Variables_and_Methods
{
    int a = 78, b = 93;
    public static void methodA()
    {
        System.out.println("Inside Method A");
    }

    public static void main(String[] args)
    {
        int c = 90;
        System.out.println("Sum of "+a+" , "+b+" And "+c+" = "+(a+b+c));
    }
}
