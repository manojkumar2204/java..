import java.util.*;

class Lcm {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}

public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int n1 = sc.nextInt();

        System.out.println("Enter second number:");
        int n2 = sc.nextInt();

        int lcm = Lcm.findLCM(n1, n2);

        System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm);

        sc.close(); 
    }
}
