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
    static void countDigits(int num)
    {
        int rem;
        int count=0;
        while(num != 0)
        {
            rem = num%10;
            System.out.println(rem);
            num = num/10;
            count++;
        }
        System.out.println("count"+count);
    }
    public static void main(String[] args) 
    {
        // printDigits(53127);
        countDigits(1234541237);
    }
}
