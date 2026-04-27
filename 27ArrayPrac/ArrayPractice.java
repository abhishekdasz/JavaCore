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
    void unSortedElem(int arr[])
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
            else
            {
                System.out.println("Unsorted elem: "+arr[i]);
                break;
            }
        }
    }
    void swapAlternateElem(int arr1[])
    {
        int arr2[] = new int[arr1.length]; 
        for(int i=0; i<=arr1.length-2; i=i+2)
        {
            arr2[i] = arr1[i+1];
            arr2[i+1] = arr1[i];
        }
        System.out.println("new array:");
        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr2[i]);
        }
    }
    void interSectionArrayElem(int arr1[], int arr2[])
    {
        for(int i=0; i<=arr1.length-1; i++)
        {
            for(int j=0; j<=arr2.length-1; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr2[j]);
                }
            }
        }
    }
    void ReverseArrayElem(int arr[])
    {
        int arr2[] = new int[arr.length]; 
        for(int i=0; i<=arr.length-1; i++)
        {

            arr2[i] = arr[arr.length-(i+1)];
        }
        System.out.println("new array:");
        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr2[i]);
        }
    }
    void AlternateExtreme(int arr[])
    {
        int arr2 [] = new int[arr.length];

        int left = 0;
        int right = arr.length-1;
        int index = 0;

        while(left<=right)
        {
            if(left == right)
            {
                arr2[index++] =arr[left];
            }
            else
            {
                arr2[index++] = arr[left];
                arr2[index++] = arr[right];
            }
            left++;
            right--;
        }

        for(int i=0; i<=arr2.length-1; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {10,20,60,40,50};
        
        ArrayPractice obj = new ArrayPractice();
        obj.LinearSearch(arr, 50);   
        System.out.println("Max elem from an array:");
        System.out.println(obj.MaxElemInArray(arr));
        System.out.println(obj.MaxElem(arr));

        int arr2[] = {2,-3,-1,4,6,-9};
        System.out.println("Sum of Positive and Negative nums:");
        obj.sumOfPosNeg(arr2);

        int arr3[] = {0,1,0,0,0,1};
        System.out.println("Count of zeros and ones in array:");
        obj.countOfZeroOne(arr3);

        int arr4[] = {0,5,3,7,11,2};
        System.out.println("Unsorted elem in array:");
        obj.unSortedElem(arr4);

        int arr5[] = {1,2,3,4,5,6};
        System.out.println("Swap alternate elem in an array:");
        obj.swapAlternateElem(arr5);

        int arr6[] = {1,2,8,13,16,20};
        int arr7[] = {2,4,8,20,30,40};
        System.out.println("Intersection elements of two array:");
        obj.interSectionArrayElem(arr6, arr7);

        obj.ReverseArrayElem(arr7);

        int arr8[] = {1,2,3,4,5};
        System.out.println("alternate extreme elem of array:");
        obj.AlternateExtreme(arr8);
    }
}