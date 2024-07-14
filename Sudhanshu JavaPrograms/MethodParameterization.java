public class MethodParameterization
{
    public static void methodA()                //Non Parameterization Method
    {
        System.out.println("Inside Method A Which has No Parameters Present Respectively");
    }
    public static void methodB(int a)          //Single Parameterized Method
    {
        System.out.println("Inside Method B which has One Parameter Present And Values are "+a+" Respectively");
    }
    public static void methodC(int a , double b)
    {
        System.out.println("Inside Method C which has two Parameters Present and their values are "+a+" and "+b+" Respectively");
    }

    public static void methodD(int a , char b , boolean c)
    {
        System.out.println("Inside Method D which has three Parameters Present and their values are "+a+" and "+b+" and "+c+" Respectively");
    }

    public static void main(String[] args)
    {
        methodA();
        methodB(67);
        methodC(56,19);
        methodD(16,'S',true);
    }
}
