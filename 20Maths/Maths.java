public class Maths 
{
    static void printDigits(int num)
    {
        int rem;
        while(num != 0)
        {
            rem = num%10;
            System.out.println(rem);
            num = num/10;
        }
    }

    public static void main(String[] args) 
    {
        printDigits(53127);

    }
}
