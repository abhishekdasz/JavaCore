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
    public static void main(String[] args) 
    {
        int arr[] = {10,20,30,40,50};
        ArrayPractice obj = new ArrayPractice();
        obj.LinearSearch(arr, 50);   
    }
}