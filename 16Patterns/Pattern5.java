// * _ _ _ _ _ _ *
// * * _ _ _ _ * *
// * * * _ _ * * *
// * * * * * * * *
// * * * _ _ * * *
// * * _ _ _ _ * *
// * _ _ _ _ _ _ *
class Pattern5 
{
    public static void main(String[] args)
    {
        int n = 10;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            for(int col=1; col<=n-row; col++)
            {
                System.out.print("  ");
            }
            for(int col=1; col<=n-row; col++)
            {
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int row=1; row<=n; row++)
        {
            if(row==1)
            {
                continue;
            }
            else
            {
                for(int col=1; col<=n-row+1; col++)
                {
                    System.out.print("* ");
                }
                for(int col=1; col<=row-1; col++)
                {
                    System.out.print("  ");
                }
                for(int col=1; col<=row-1; col++)
                {
                    System.out.print("  ");
                }
                for(int col=1; col<=n-row+1; col++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}