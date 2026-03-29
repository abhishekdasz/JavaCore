import java.util.Scanner;

public class _3SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        double rateOfInt = sc.nextDouble();
        double noOfYears = sc.nextDouble();

        double accuredAmount = principal*(1+((rateOfInt/100)*noOfYears));
        System.out.println(accuredAmount);
    }
}