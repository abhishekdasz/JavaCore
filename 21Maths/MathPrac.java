public class MathPrac 
{
    static int findGCD(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        return ans;
    }
    
    static int findLCM(int a, int b)
    {
        int lcm = (a*b)/findGCD(a, b);
        return lcm;
    }
    
    static boolean isArmstrongNum(int num)
    {
        int originalNum = num;
        int sum =0;
        while(num!=0)
        {
            int rem = num%10;
            num = num/10;
            System.out.println(rem);
            int cubeOfRem = rem * rem * rem;
            sum = sum + cubeOfRem;
        }
        if(originalNum == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    static void findDivisors(int num)
    {
        for(int i=1; i<=num-1; i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
        System.out.println(num);
    }

    static boolean isPerfectNum(int num)
    {
        int sum=0;
        for(int i=1; i<=num-1; i++)
        {
            if(num%i==0)
            {
                sum = sum+i;
            }
        }
        if(num == sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean isPrime(int num)
    {
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println(findGCD(18, 12));
        System.out.println(findLCM(18, 12));
        System.out.println(isArmstrongNum(153));
        System.out.println("divisors");
        findDivisors(28);
        System.out.println("isPerfectNum");
        System.out.println(isPerfectNum(28));
        System.out.println("isPrime");
        System.out.println(isPrime(23));
    }
}
