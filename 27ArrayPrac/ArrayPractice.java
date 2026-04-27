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
    void sumOfPosNeg(int arr[])
    {
        int sumOfPos = 0;
        int sumOfNeg = 0;
        for(int num: arr)
        {
            if(num<0)
            {
                sumOfNeg = sumOfNeg + num;
            }
            else
            {
                sumOfPos = sumOfPos + num;
            }
        }
        System.out.println("Sum of Positive nums: "+sumOfPos);
        System.out.println("Sum of Negative nums: "+ sumOfNeg);
    }
    void countOfZeroOne(int arr[])
    {
        int countOfZero = 0;
        int countOfOne = 0;
        for(int num: arr)
        {
            if(num==0)
            {
                countOfZero++;
            }
            else
            {
                countOfOne++;
            }
        }
        System.out.println("Count of zeros: "+countOfZero);
        System.out.println("Count of ones: "+ countOfOne);        
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,20,60,40,50};
        int arr2[] = {2,-3,-1,4,6,-9};
        int arr3[] = {0,1,0,0,0,1};
        ArrayPractice obj = new ArrayPractice();
        obj.LinearSearch(arr, 50);   
        System.out.println("Max elem from an array:");
        System.out.println(obj.MaxElemInArray(arr));
        System.out.println(obj.MaxElem(arr));

        System.out.println("Sum of Positive and Negative nums:");
        obj.sumOfPosNeg(arr2);

        System.out.println("Count of zeros and ones in array:");
        obj.countOfZeroOne(arr3);
    }
}