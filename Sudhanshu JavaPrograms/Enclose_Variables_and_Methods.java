public class Enclose_Variables_and_Methods
{
    static int a = 78, b = 93;
    public  void methodA()
    {
        System.out.println("Inside Method A");
    }

    public static void main(String[] args)
    {
        int c = 90;
        methodA();
        System.out.println("Sum of "+a+" , "+b+" And "+c+" = "+(a+b+c));
    }
}
