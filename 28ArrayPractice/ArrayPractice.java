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
    void shiftElemByOne(int arr[])
    {
        int arr2[] = new int[arr.length];
        arr2[0] = arr[arr.length-1];
        for(int i=1; i<=arr.length-1; i++)
        {
            arr2[i] = arr[i-1]; 
        }
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
    void rightShift(int arr[])
    {
        int last = arr[arr.length-1];
        for(int i=arr.length-1; i>=1; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void extremeElemInALtManner(int arr[])
    {
        int left = 0;
        int right = arr.length-1; 

        while(left<=right)
        {
            if(left==right)
            {
                System.out.println(arr[left]+" ");
            }
            else
            {
                System.out.print(arr[left]+" ");
                System.out.print(arr[right]+" ");
            }
            left++;
            right--;
        }
    }
    void rightShiftElemByK(int arr[], int k)
    {
        int last[] = new int[k];

        int right = arr.length-k;
        for(int j=0; j<=last.length-1; j++)
        {
            last[j] = arr[right];
            right++;
        }

        for(int i=0; i<=last.length-1; i++)
        {
            System.out.println(last[i]);
        }
        for(int i=0; i<=arr.length-k-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        ArrayPractice obj = new ArrayPractice();
        int arr[] = {1,2,3,4,5,6,7};
        obj.reverseArray(arr);   

        System.out.println();
        System.out.println("Right shift elem of array by one place:");
        int arr2[] = {10,20,30,40,50,60,70};
        obj.shiftElemByOne(arr2);

        System.out.println();
        System.out.println("Right shift elem of array by one place with one array only:");
        obj.rightShift(arr2);

        System.out.println();
        System.out.println("Printing Extreme Element in array in alternate Manner:");
        int arr3[] = {1,2,3,4,5,6,7,8};
        obj.extremeElemInALtManner(arr3);

        System.out.println();
        int arr4[] = {10,20,30,40,50,60,70,80};
        System.out.println("rightShiftElemByK:");
        obj.rightShiftElemByK(arr4, 3);
    }
}