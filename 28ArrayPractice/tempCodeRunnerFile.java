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