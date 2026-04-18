import java.util.Scanner;

public class Array 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[5];
        arr[1] = 10;
        arr[4] = 20;

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

        int arr2[] = new int[3];
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter 3 int values for arr2");
        for(int i=0; i<=arr2.length-1; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("arr2:");
        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("hello");
    }    
}
