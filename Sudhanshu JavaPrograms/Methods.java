public class Methods
{
    static int a = 9, b = 11,c;

    public static void display_values()
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void sum()
    {
        c = a + b;
        System.out.println("Sum = "+c);
    }
    public static void product()
    {
       int prod = a * b ;                               //Here Prod is a method variable
       System.out.println("Product = "+prod);
    }
    public static void main(String[] args)
    {
        display_values();                               //Method-Calling Statement
        sum();                                          //Method-Calling Statement
        product();                                      //Method-Calling Statement
    }
}