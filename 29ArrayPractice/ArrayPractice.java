public class ArrayPractice 
{
    void rightShiftElemByK(int arr[], int k)
    {
        int rightArr[] = new int[k];

        int right = arr.length-k;
        for(int i=0; i<=rightArr.length-1; i++)
        {
            rightArr[i] = arr[right];
            right++;
        }

        for(int i=arr.length-1; i>=k; i--)
        {
            arr[i] = arr[i-k];
        }

        for(int i=0; i<=k-1; i++)
        {
            arr[i]=rightArr[i];
        }

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        ArrayPractice obj = new ArrayPractice();
        int arr[] = {10,20,30,40,50,60,70,80};
        obj.rightShiftElemByK(arr, 2);
    }    
}
