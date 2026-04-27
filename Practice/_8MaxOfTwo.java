import java.util.Scanner;

public class _8MaxOfTwo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a, b));
        int max = (a>b) ? a : b;
        System.out.println(max);
    }
}
