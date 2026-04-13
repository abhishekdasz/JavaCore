public class Pattern7 
{
    public static void main(String[] args) 
    {
        int n=10;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row; col++)
            {
                System.out.print(" ");
            }
            for(int star=1; star<=row*2-1; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
