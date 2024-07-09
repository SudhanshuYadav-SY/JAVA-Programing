public class Methods
{
    static int a = 9, b = 11,c;

    public static void method_1()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args)
    {
        method_1();
        c = a + b;
        System.out.println("Sum = "+c);
    }
}