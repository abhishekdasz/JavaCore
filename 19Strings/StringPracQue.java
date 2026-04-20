public class StringPracQue 
{
    static int getVowelsCount (String s) 
    {
        int count = 0;
        for(int i=0; i<=s.length()-1; i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    } 
    static String reverseStringF (String s)
    {
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            reverse = reverse+s.charAt(i);
        }
        return reverse;
    } 

    static boolean isPalindrome(String s)
    {
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        return s.equals(reverse);
    }
    public static void main(String[] args) 
    {
        String str1 = "Hello World";

        for(char i=0; i<=str1.length()-1; i++)
        {
            System.out.println(str1.charAt(i));
        }
        String str2 = "Abhishek Das";
        for(int i=0; i<=str2.length()-1; i++)
        {
            char ch = str2.charAt(i);
            System.out.println(ch);
        }
        char ch [] = str2.toCharArray();
        System.out.println(ch.length); 


        System.out.println(getVowelsCount("abhishek das"));
        System.out.println(reverseStringF("abhishek"));

        System.out.println(isPalindrome("mummy"));
    }
}
