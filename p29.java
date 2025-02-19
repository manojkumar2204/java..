//diamond star pattern

public class p29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 7 - 1; i >= 1; i--) {
            for (int j = 7; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}