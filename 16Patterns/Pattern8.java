// A
// A B 
// A B C
// A B C D 
// A B C D E
public class Pattern8
{
    public static void main(String [] args)
    {
        int n=5;
        for(int row=1; row<=n; row++)
        {
            char k='A';
            for(int col=1; col<= row; col++)
            {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println("");
        }
    }
}