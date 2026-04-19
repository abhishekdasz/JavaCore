import java.util.Scanner;

public class TwoDarr1ay 
{
    public static void main(String[] args) 
    {
        // int arr1[][]=new int[2][4];

        int arr1[][] = {{2,4},{6,8},{10,12}};

        int rowLength = arr1.length;
        int colLength = arr1[0].length;

        for(int row=0; row<=rowLength-1; row++)
        {
            for(int col=0; col<=colLength-1; col++)
            {
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }



        int arr2[][]=
        {
            {1,2,3},
            {4,5},
            {6,7,8,9,10}
        };

        System.out.println("arr2: ");
        for(int row=0; row<=arr2.length-1; row++)
        {
            for(int col=0; col<=arr2[row].length-1; col++)
            {
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int arr3[][] = new int[3][5];

        System.out.println("Enter arr3:");
        for(int row=0; row<=arr3.length-1; row++)
        {
            for(int col=0; col<=arr3[row].length-1; col++)
            {
                arr3[row][col]= sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("arr3: ");
        int sum=0;
        int max = arr3[0][0];
        int min = arr3[0][0];
        for(int row=0; row<=arr3.length-1; row++)
        {
            for(int col=0; col<=arr3[row].length-1; col++)
            {
                System.out.print(arr3[row][col]+" ");
                sum = sum+arr3[row][col];

                if(max < arr3[row][col])
                {
                    max = arr3[row][col];
                }
                if(min > arr3[row][col])
                {
                    min = arr3[row][col];
                }
            }
            System.out.println();
        }

        System.out.println("sum of arr3 elem:" +sum);
        System.out.println("max of arr3 elem:" +max);
        System.out.println("min of arr3 elem:" +min);
    }
}
