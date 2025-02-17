//multiply two floating point numbers
import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first floating number:");
        float x= sc.nextFloat();

        System.out.println("enter second floating number:");
        float y= sc.nextFloat();

        float result = x * y;
        System.out.println(result);

        sc.close();
    }
    
}
