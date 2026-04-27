public class ArrayPrac 
{
    double AvgElem(int arr[])
    {
        double sum =0;
        for(int num: arr)
        {
            sum = sum + num;
        }
        return sum/arr.length;
    }
    void MultEachElem(int arr[])
    {
        for(int num: arr)
        {
            System.out.println(num*10);
        }
    }
    
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4};
        ArrayPrac obj = new ArrayPrac();

        System.out.println("Average of elements in array:");
        System.out.println(obj.AvgElem(arr));

        System.out.println("Multiply each element of array with 10");
        obj.MultEachElem(arr);
    }
}
