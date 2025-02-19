//spiral pattern of number
import java.util.Scanner;

public class p32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();
        sc.close();

        int[][] spiral = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int num = 1;

        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                spiral[bottom][i] = num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                spiral[i][left] = num++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d ", spiral[i][j]);
            }
            System.out.println();
        }
    }
}

