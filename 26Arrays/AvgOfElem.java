public class AvgOfElem 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,4,1,3};
        double sum = 0;
        for(int num: arr)
        {
            sum = sum+num;
        } 
        System.out.println(sum/arr.length);
    }
}
