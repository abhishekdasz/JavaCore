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

    static boolean isPalindrome(int num)
    {
        int tempnum = num;
        int rem;
        int revnum = 0;
        while(num != 0)
        {
            rem = num%10;
            revnum = revnum*10;
            revnum = revnum+rem;
            num = num/10;
        }
        
        System.out.println(tempnum);
        System.out.println(revnum);
        if(tempnum==revnum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static void isPrime(int num)
    {
        int count = 0;
        for(int i=2; i<=num-1; i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count > 0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("printDigits");
        printDigits(53127);
        System.out.println("countDigits");
        countDigits(1932);
        System.out.println("reverse number");
        reverseNums(53127);
        System.out.println("isPalindrome");
        System.out.println(isPalindrome(12121));
        System.out.println(isPalindrome(123));

        System.out.println("isPrime");
        isPrime(23);
        isPrime(24);
    }
}
