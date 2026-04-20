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
    static void reverseNums(int num) 
    {
        int rem;
        int revnum = 0;
        while(num != 0)
        {
            rem = num%10;
            revnum = revnum*10;
            revnum = revnum+rem;
            
            System.out.println(rem);
            num = num/10;
        }
        System.out.println(revnum);
    }
    public static void main(String[] args) 
    {
        System.out.println("printDigits");
        printDigits(53127);
        System.out.println("countDigits");
        countDigits(1932);
        System.out.println("reverse number");
        reverseNums(53127);
    }
}
