/*
Typecasting is nothing but converting a particular literal type
to a particular data type without giving any error on the console

In JAVA, there are 2 types of Type-casting namely as shown below:

1. Widening Typecasting (Implicit Type-casting)
2. Narrowing Typecasting (Explicit Type-casting)

 */

public class Types_Of_Typecasting
{
    public static void main(String[] args)
    {
        long b = 9;                                 //Example of Implicit Typecasting
        System.out.println(b);
        int a = (int) 9L;                           //Example of Explicit Typecasting
        System.out.println(a);
    }
}