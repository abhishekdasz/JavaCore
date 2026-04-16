// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5

class Pattern6
{
    public static void main(String[] args)
    {
        int n=5;
        for(int row=1; row<=n; row++)
        {
            int k=1;
            for(int col=1; col<= row; col++)
            {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println("");
        }
    }
}