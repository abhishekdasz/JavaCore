public class Pattern6 
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n; col++)
            {
                System.out.print((char)('A'-1 + col));
            }
            System.out.println();
        }
    }
}
