
class Method
{
    static void printTwoTable()
    {
        int a=2;
        for(int i=1; i<=10; i++)
        {
            System.out.println(a*i + " ");
        }
        return;
    }

    static int sumOfNums()
    {
        int a=10;
        int b=5;
        return a*b;
    }
    static int sumOfNums(int a, int b)
    {
        return a*b;
    }
    public static void main(String []args)
    {
        System.out.println("Start");

        printTwoTable();
        System.out.println("End");

        int res = sumOfNums(); 
        System.out.println(res);
        System.out.println(sumOfNums(5, 6));
    }
}