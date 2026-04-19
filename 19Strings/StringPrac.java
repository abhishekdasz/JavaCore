public class StringPrac 
{
    public static void main(String[] args) 
    {
        String str = "Abhishek Das          ";
        System.out.println(str);

        String str2 = new String("abhishek das");
        String str3 = "Abhishek Das";
        String str4 = new String("Abhishek Das");
        System.out.println(str2);

        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.substring(9, 12));
        System.out.println(str.contains("  Das"));
        System.out.println(str.contains(" Das"));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str==str2);
        System.out.println("==");
        System.out.println(str == str3);
        System.out.println("== again");
        System.out.println(str == str4);
        System.out.println(str.equals(str4));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


        System.out.println(str.length());
        System.out.println("trim");
        str = str.trim();
        System.out.println(str.length());
        

        String str5 = "Hello,World!This,is,Abhishek Das";
        for(char i=0; i<=str5.length()-1; i++)
        {
            System.out.print(str5.charAt(i));
        }
        System.out.println();
        String [] str5words = str5.split(",");
        System.out.println("split");
        for(char i=0; i<=str5words.length-1; i++)
        {
            System.out.println(str5words[i]);
        }

        String str6 = "Hello World";
        System.out.println(str6.startsWith("Ho"));
        System.out.println(str6.endsWith("lD"));

        int a = 123;
        System.out.println(a+1); 
        String a2 = String.valueOf(a);
        System.out.println(a2); 
        System.out.println(a2+1); 

        String str7 = "Hello";
        char ch [] = str7.toCharArray();
        for(char i=0; i<=ch.length-1; i++)
        {
            System.out.println(ch[i]);
        }

        String str8 = " ";
        System.out.println(str8.isEmpty());
        System.out.println(str8.isBlank());
        String str9 = "hello";
        str9 = str9.replace('h', 'H');
        System.out.println(str9);
        String str10 = "Thank You";
        System.out.println(str10);
    }
}
