class ArrayPractice 
{
    void LinearSearch(int arr[], int num)
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i] == num)
            {
                System.out.println("Num is at "+i+"th position.");
            }
        }
    }
    int MaxElemInArray(int arr[])
    {
        int max = arr[0];
        for(int num: arr)
        {
            if(max<num)
            {
                max = num;
            }
        }
        return max;
    }
    int MaxElem(int arr[])
    {
        int max = arr[0];
        for(int num: arr)
        {
            max = Math.max(max, num);
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,20,60,40,50};
        ArrayPractice obj = new ArrayPractice();
        obj.LinearSearch(arr, 50);   
        System.out.println("Max elem from an array:");
        System.out.println(obj.MaxElemInArray(arr));
        System.out.println(obj.MaxElem(arr));
    }
}