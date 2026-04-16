//       1
//     2 2 2
//   3 3 3 3 3
// 4 4 4 4 4 4 4
public class Pattern3 
{
    public static void main(String [] args)
    {
        int n= 8;
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row; col++)
            {
                System.out.print("  ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print(row + " ");
            }
            for(int col=1; col<=row-1; col++)
            {
                System.out.print(row+ " ");
            }
            System.out.println("");
        }
    }
}