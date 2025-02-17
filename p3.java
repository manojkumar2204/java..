//swap two numbers
import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number:");
        int b = sc.nextInt();

        int swap = a;
        a = b;
        b = swap;

        System.out.println("after swapping a= "+ a +" b= "+ b);

        
    }
    
}
