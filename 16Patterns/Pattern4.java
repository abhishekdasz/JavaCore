public class Pattern4
{
    public static void main(String [] args)
    {
        int n=5;
        for(int row=1; row<=n; row++)
        {
            char k='E';
            for(int col=1; col<= row; col++)
            {
                System.out.print(k+ " ");
                k--;
            }
            System.out.println("");
        }
    }
}