import java.util.Scanner;

public class _4CompoundInterest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal=");
        double principal = sc.nextDouble();
        System.out.print("Rate of Interest=");
        double rateofint = sc.nextDouble();
        System.out.print("Num of years=");
        double time = sc.nextDouble();
        
        double rate = rateofint/100;
        double a= principal*Math.pow((1+rate), time);
        double CI = a-principal;
        System.out.println("Accured Amount=" + a +" & Compound Interest="+CI);
    }    
}
