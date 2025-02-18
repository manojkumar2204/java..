//check armstrong number between two integers
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        // Check Armstrong numbers in the given range
        for (int i = lower; i <= upper; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
    public static boolean checkArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0, temp = num;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}
