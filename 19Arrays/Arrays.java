class Arrays
{
    public static void main(String[] args) 
    {
        int arr1[] = {20, 10, 40};

        System.out.println("arr1:");
        int sum=0;
        int mult=1;
        int max=arr1[0];
        int min=arr1[0];
        for(int i=0; i<=arr1.length-1; i++)
        {
            System.out.println(arr1[i]);
            sum=sum+arr1[i];
            mult = mult*arr1[i];

            if(arr1[i]>max)
            {
                max = arr1[i];
            }
            if (arr1[i]<min) 
            {
                min = arr1[i];
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("mult:"+mult);
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }
}