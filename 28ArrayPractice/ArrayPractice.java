class ArrayPractice 
{
    void reverseArray(int arr[])
    {
        int left = 0;
        int right = arr.length-1;

        while(left < right)
        {
            int temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void main(String[] args) 
    {
        ArrayPractice obj = new ArrayPractice();
        int arr[] = {1,2,3,4,5,6,7};
        obj.reverseArray(arr);   

    }
}