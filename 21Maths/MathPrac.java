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
    public static void main(String[] args) 
    {
        System.out.println(findGCD(18, 12));
        System.out.println(findLCM(18, 12));
    }
}
