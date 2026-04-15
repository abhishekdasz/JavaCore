public class Pattern1 
{
    public static void main(String [] args)
    {
        int n=6;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row; col++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            int k=row-1;
            for(int col=1; col<=2*k-1; col++)
            {
                System.out.print("  ");
            }
            if(row==1)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }


        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row-1; col++)
            {
                System.out.print("  ");
            }
            System.out.print("*");
            for(int col=1; col<= ((n-row)*2)-1; col++ )
            {
                System.out.print("  ");
            }
            if(row==n)
            {
                System.out.print("");
            }
            else
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
