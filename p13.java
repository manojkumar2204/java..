//check a input number is neon number or not
import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num, sum = 0, temp = square;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }

        sc.close();
    }
}
