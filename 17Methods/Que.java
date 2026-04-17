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
    public static void main(String[] args) 
    {
        greetMsg();   
        System.out.println(sumOfTwoNums(10, 5));
        System.out.println(isEven(10));
    }
}
