import java.util.Scanner;

class _7Prime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int notPrime = 0;
        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                notPrime++;
                break;
            }
        }
        if(notPrime>0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}