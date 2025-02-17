import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println(n + " is Not a Prime Number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                isPrime = false; 
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is Not a Prime Number.");
        }
    }
}
