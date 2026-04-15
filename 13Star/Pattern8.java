public class Pattern8 
{
    public static void main(String[] args) 
    {
        int n = 4; 
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row-1; col++)
            {
                System.out.print(" ");
            }
            for(int star=1; star<=((n-row)*2)+1; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
