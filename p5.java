//add two complex numbers
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of first complex number :");
        double real1 = sc.nextDouble();

        System.out.println("Enter imaginary part of first complex number :");
        double img1 = sc.nextDouble();

        System.out.println("Enter real part of second complex number :");
        double real2 = sc.nextDouble();

        System.out.println("Enter imaginary  part of second complex number :");
        double img2 = sc.nextDouble();

        double realSum = real1 + real2;
        double imaginarySum = img1 + img2;

        System.out.println("sum="+realSum +"+" +imaginarySum +"i");

    }
    
}
