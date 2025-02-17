//add two binary strings
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first binary number:");
        String B1 = sc.next();

        System.out.println("enter second binary number:");
        String B2 = sc.next();

        int a = Integer.parseInt(B1,2);
        int b = Integer.parseInt(B2,2);

        int sum = a+b;

        String result = Integer.toBinaryString(sum);

        System.out.println(result);
        sc.close();


    }
    
}
