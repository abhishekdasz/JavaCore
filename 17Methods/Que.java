public class Que 
{
    static void greetMsg()
    {
        System.out.println("Welcome");
    }
    static int sumOfTwoNums(int a, int b)
    {
        return a+b;
    }
    static boolean isEven(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        return false;
    }
    static int getMaximum(int a, int b)
    {
        if(a<b)
        {
            return b;
        }
        return a;
    }
    static float calculatePerc(int obtained, int total)
    {
        return ((float)obtained/total)*100;
    }
    static int methOverloading(int a, String b)
    {
        System.out.println("Hello World, a: "+ a +" & b:" + b);
        return a;
    }

    static int updateMethod(int x)
    {
        x= x+10;
        return x;
    }
    public static void main(String[] args) 
    {
        greetMsg();   
        System.out.println(sumOfTwoNums(10, 5));
        System.out.println(isEven(10));
        System.out.println(getMaximum(10, 20));
        System.out.println(calculatePerc(120, 200));
        System.out.println(methOverloading(10, "Hello"));

        int x=50;
        System.out.println(updateMethod(x));
        System.out.println(x);
    }
}
