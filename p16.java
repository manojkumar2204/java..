//find the even sum of fibonacci series till number n

import java.util.Scanner;

public class p16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        
        int a = 0, b = 1, sum = 0;
        while (b <= n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("Sum of even Fibonacci numbers till " + n + " is: " + sum);
    }
}
