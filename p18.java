//calculate compound intrest
import java.util.Scanner;

public class p18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        System.out.print("Enter Number of times interest applied per year: ");
        int n = sc.nextInt();
        sc.close();

        double compoundInterest = principal * Math.pow((1 + rate / (100 * n)), n * time) - principal;
        System.out.println("Compound Interest is: " + compoundInterest);
    }
}
