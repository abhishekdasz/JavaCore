//       A
//     A B A
//   A B C B A
// A B C D C B A
class Pattern1 
{
    public static void main(String[] args) 
    {
        int n=4;
        
        for(int row=1; row<=n; row++)
        {
            char ch = 'A';
            for(int col=1; col<=n-row; col++)
            {
                System.out.print("_ ");
            }
            for(int col=1; col<=row; col++)
            {
                System.out.print(ch+" ");
                ch++;
            }

            ch -= 2;  // or ch = (char)(ch - 2);
            for(int col = 1; col < row; col++)
            {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}